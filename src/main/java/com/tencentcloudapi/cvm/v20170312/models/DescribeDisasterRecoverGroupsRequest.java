/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDisasterRecoverGroupsRequest extends AbstractModel{

    /**
    * ID list of spread placement groups. You can operate up to 100 spread placement groups in each request.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * Name of a spread placement group. Fuzzy match is supported.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Offset; default value: 0. For more information on `Offset`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results returned; default value: 20; maximum: 100. For more information on `Limit`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377). 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get ID list of spread placement groups. You can operate up to 100 spread placement groups in each request. 
     * @return DisasterRecoverGroupIds ID list of spread placement groups. You can operate up to 100 spread placement groups in each request.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set ID list of spread placement groups. You can operate up to 100 spread placement groups in each request.
     * @param DisasterRecoverGroupIds ID list of spread placement groups. You can operate up to 100 spread placement groups in each request.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get Name of a spread placement group. Fuzzy match is supported. 
     * @return Name Name of a spread placement group. Fuzzy match is supported.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a spread placement group. Fuzzy match is supported.
     * @param Name Name of a spread placement group. Fuzzy match is supported.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Offset; default value: 0. For more information on `Offset`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377). 
     * @return Offset Offset; default value: 0. For more information on `Offset`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset; default value: 0. For more information on `Offset`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377).
     * @param Offset Offset; default value: 0. For more information on `Offset`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results returned; default value: 20; maximum: 100. For more information on `Limit`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377).  
     * @return Limit Number of results returned; default value: 20; maximum: 100. For more information on `Limit`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377). 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results returned; default value: 20; maximum: 100. For more information on `Limit`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377). 
     * @param Limit Number of results returned; default value: 20; maximum: 100. For more information on `Limit`, see the corresponding section in API [Introduction](https://intl.cloud.tencent.com/document/product/377). 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

