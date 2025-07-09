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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderModifyObject extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * New Product Identification. PRO_VERSION: Professional Edition; FLAGSHIP: Premium Edition
    */
    @SerializedName("NewSubProductCode")
    @Expose
    private String NewSubProductCode;

    /**
    * Scale-up/Scale-down Count, which is ignored for reconfiguration sub-product
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get New Product Identification. PRO_VERSION: Professional Edition; FLAGSHIP: Premium Edition 
     * @return NewSubProductCode New Product Identification. PRO_VERSION: Professional Edition; FLAGSHIP: Premium Edition
     */
    public String getNewSubProductCode() {
        return this.NewSubProductCode;
    }

    /**
     * Set New Product Identification. PRO_VERSION: Professional Edition; FLAGSHIP: Premium Edition
     * @param NewSubProductCode New Product Identification. PRO_VERSION: Professional Edition; FLAGSHIP: Premium Edition
     */
    public void setNewSubProductCode(String NewSubProductCode) {
        this.NewSubProductCode = NewSubProductCode;
    }

    /**
     * Get Scale-up/Scale-down Count, which is ignored for reconfiguration sub-product 
     * @return InquireNum Scale-up/Scale-down Count, which is ignored for reconfiguration sub-product
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set Scale-up/Scale-down Count, which is ignored for reconfiguration sub-product
     * @param InquireNum Scale-up/Scale-down Count, which is ignored for reconfiguration sub-product
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    public OrderModifyObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderModifyObject(OrderModifyObject source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.NewSubProductCode != null) {
            this.NewSubProductCode = new String(source.NewSubProductCode);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "NewSubProductCode", this.NewSubProductCode);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);

    }
}

