package org.springblade.modules.mjkj.common.config.util.converter.impl;


import org.springblade.modules.mjkj.common.config.util.ConvertUtils;
import org.springblade.modules.mjkj.common.config.util.SpringContextUtils;
import org.springblade.modules.mjkj.common.config.util.converter.field.FieldFieldCommentConverter;
import org.springblade.modules.mjkj.common.cgform.entity.CgformField;
import org.springblade.modules.mjkj.common.cgform.service.ISysDictService;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户
 */
public class SelUserFieldCommentConverter extends FieldFieldCommentConverter {

    public SelUserFieldCommentConverter(CgformField onlCgformField) {
        ISysDictService sysBaseApi = SpringContextUtils.getBean(ISysDictService.class);
        String sysUser = "blade_user";
        String realname = "real_name";
        String username = "id";
        this.dictList = sysBaseApi.queryTableDictItemsByCode(sysUser, realname, username);
        this.filed = onlCgformField.getDbFieldName();
    }

    @Override
    public String converterToVal(String txt) {
        if (ConvertUtils.isEmpty(txt)) {
            return null;
        } else {
            List<String> arrayList = new ArrayList<>();
            String[] strings = txt.split(",");

            for (String s : strings) {
                String s1 = super.converterToVal(s);
                if (s1 != null) {
                    arrayList.add(s1);
                }
            }

            return String.join(",", arrayList);
        }
    }

    @Override
    public String converterToTxt(String val) {
        if (ConvertUtils.isEmpty(val)) {
            return null;
        } else {
            List<String> arrayList = new ArrayList<>();
            String[] strings = val.split(",");

            for (String s : strings) {
                String s1 = super.converterToTxt(s);
                if (s1 != null) {
                    arrayList.add(s1);
                }
            }

            return String.join(",", arrayList);
        }
    }
}
