package com.gwh.service;

import com.gwh.source.DataSource;

public interface UserService {

     @DataSource("dataSourceDefault")
     String queryUser(Integer id);

     @DataSource("dataSourceVps")
     String getUserById(Integer id);

}
