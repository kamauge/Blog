/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamauge.blog.service;

import com.kamauge.blog.payload.PostDto;
import com.kamauge.blog.payload.PostResponse;

/**
 *
 * @author Gerald.Kamau
 */
public interface PostService {
    
   public PostDto createPost(PostDto postDto);
   
   public PostResponse getPosts(int pageNo,int pageSize);
   
   public PostDto getOnePost(long id);
  
   public PostDto updatePost(PostDto postDto,long id);
    
}
