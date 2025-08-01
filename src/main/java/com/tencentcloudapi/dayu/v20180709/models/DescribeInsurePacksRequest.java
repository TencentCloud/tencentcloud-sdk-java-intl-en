/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInsurePacksRequest extends AbstractModel {

    /**
    * Guarantee package ID, which is optional. If you need to get the guarantee package with a specified ID (such as insure-000000xe), please use this field
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
     * Get Guarantee package ID, which is optional. If you need to get the guarantee package with a specified ID (such as insure-000000xe), please use this field 
     * @return IdList Guarantee package ID, which is optional. If you need to get the guarantee package with a specified ID (such as insure-000000xe), please use this field
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set Guarantee package ID, which is optional. If you need to get the guarantee package with a specified ID (such as insure-000000xe), please use this field
     * @param IdList Guarantee package ID, which is optional. If you need to get the guarantee package with a specified ID (such as insure-000000xe), please use this field
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    public DescribeInsurePacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInsurePacksRequest(DescribeInsurePacksRequest source) {
        if (source.IdList != null) {
            this.IdList = new String[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new String(source.IdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);

    }
}

