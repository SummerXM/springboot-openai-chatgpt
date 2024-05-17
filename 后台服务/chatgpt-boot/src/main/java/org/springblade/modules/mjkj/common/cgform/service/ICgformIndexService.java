/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.modules.mjkj.common.cgform.service;

import org.springblade.modules.mjkj.common.cgform.entity.CgformIndex;
import org.springblade.core.mp.base.BaseService;

import java.util.List;

/**
 *  服务类
 *
 * @author BladeX
 * @since 2021-05-20
 */
public interface ICgformIndexService extends BaseService<CgformIndex> {

     List<CgformIndex> getCgformIndexsByCgformId(Long cgformId);
    //索引是否存在
     boolean isExistIndex(String countSql);
    //创建索引
     void createIndex(Long headId, String databaseType, String tbname);
}
