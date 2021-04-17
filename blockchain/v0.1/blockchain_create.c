blockchain_t *blockchain_create(void){

    blockchain* in_chain = malloc(sizeof(blockchain));

    in_chain->head = blink_create();
    in_chain->head->data.time = 0;
    in_chain->head->data.proof = 100;
    in_chain->head->data.trans_list_length = 0;
    memset(in_chain->head->data.trans_list,0, sizeof(in_chain->head->data.trans_list));
    memset(in_chain->head->data.posts,0, sizeof(in_chain->head->data.posts));

    for(int i = 0; i < BLOCK_DATA_SIZE; i++) {
        in_chain->head->data.posts[i].data = '0';
    }
    in_chain->head->data.posts_list_length = 0;


    in_chain->last_proof_of_work = 100;
    memset(in_chain->trans_list, 0, sizeof(in_chain->trans_list));

    memset(in_chain->new_posts, 0, sizeof(in_chain->new_posts));

    for(int i = 0; i < BLOCK_DATA_SIZE; i++) {
        in_chain->new_posts[i].data = '0';
        in_chain->new_posts[i].poster[0] = '0';
        in_chain->new_posts[i].signature[0] = '0';
    }

    hash_block(in_chain->last_hash, &in_chain->head->data);
    
    in_chain->trans_index = 0;
    in_chain->post_index = 0;
    in_chain->length = 0;

    in_chain->quickledger = dict_create();
    in_chain->verified = dict_create();

    in_chain->total_currency = 0;
    
    char block[BLOCK_STR_SIZE];
    string_block(block,&(in_chain->head->data));
    strcpy(in_chain->last_block,block);



    return in_chain;
}
