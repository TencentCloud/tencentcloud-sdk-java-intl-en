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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceParamTplDetailRequest extends AbstractModel {

    /**
    * Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID.
    */
    @SerializedName("TplId")
    @Expose
    private String TplId;

    /**
    * Parameter name. Pass in this value to retrieve parameter details of this field. Leave it empty to return all parameters.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
     * Get Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID. 
     * @return TplId Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID.
     */
    public String getTplId() {
        return this.TplId;
    }

    /**
     * Set Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID.
     * @param TplId Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID.
     */
    public void setTplId(String TplId) {
        this.TplId = TplId;
    }

    /**
     * Get Parameter name. Pass in this value to retrieve parameter details of this field. Leave it empty to return all parameters. 
     * @return ParamName Parameter name. Pass in this value to retrieve parameter details of this field. Leave it empty to return all parameters.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name. Pass in this value to retrieve parameter details of this field. Leave it empty to return all parameters.
     * @param ParamName Parameter name. Pass in this value to retrieve parameter details of this field. Leave it empty to return all parameters.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    public DescribeDBInstanceParamTplDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceParamTplDetailRequest(DescribeDBInstanceParamTplDetailRequest source) {
        if (source.TplId != null) {
            this.TplId = new String(source.TplId);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplId", this.TplId);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);

    }
}

