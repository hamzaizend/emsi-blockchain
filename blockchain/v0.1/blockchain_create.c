#include "openssl/crypto.h"

struct block{
  unsigned char prev_Hash[SHA256_DIGEST_LENGTH];
  int blockData;
  struct block *link;
}*head;

void addBlock(int data){
  if(head == null){
    head = malloc(sizeof(struct block));
    SHA256("",sizeof(""),head->prev_Hash);
    head->blockData=data;
    return ;
  }
  struct block *currentBlock=head;
  while(currentBlock->link)
    currentBlock=currentBlock->link;
  struct block *newBlock=malloc(sizeof(struct block));
  currentBlock->link=newBlock;
  newBlock->blockData=data;
  SHA256(toString(*currentBlock),sizeof(*currentBlock),newBlock->prev_Hash);
}
