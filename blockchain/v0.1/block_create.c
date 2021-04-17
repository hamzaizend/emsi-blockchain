#include "openssl/crypto.h"

void addBlock(int data){
  if(head == null){
    head = malloc(sizeof(struct block));
    SHA256("",sizeof(""),head->prevHash);
    head->blockData=data;
    return ;
  }
  struct block *currentBlock=head;
  while(currentBlock->link)
    currentBlock=currentBlock->link;
  struct block *newBlock=malloc(sizeof(struct block));
  currentBlock->link=newBlock;
  newBlock->blockData=data;
  SHA256(toString(*currentBlock),sizeof(*currentBlock),newBlock->prevHash);
}
