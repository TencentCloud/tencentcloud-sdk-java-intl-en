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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateParamTemplateRequest extends AbstractModel {

    /**
    * Parameter template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture). If `TempateId` is specified, this parameter can be left blank; otherwise, it is required.
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * ID of the source parameter template.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Parameter list.
    */
    @SerializedName("ParamList")
    @Expose
    private InstanceParam [] ParamList;

    /**
     * Get Parameter template name. 
     * @return Name Parameter template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter template name.
     * @param Name Parameter template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter template description. 
     * @return Description Parameter template description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Parameter template description.
     * @param Description Parameter template description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture). If `TempateId` is specified, this parameter can be left blank; otherwise, it is required. 
     * @return ProductType Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture). If `TempateId` is specified, this parameter can be left blank; otherwise, it is required.
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture). If `TempateId` is specified, this parameter can be left blank; otherwise, it is required.
     * @param ProductType Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture). If `TempateId` is specified, this parameter can be left blank; otherwise, it is required.
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get ID of the source parameter template. 
     * @return TemplateId ID of the source parameter template.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set ID of the source parameter template.
     * @param TemplateId ID of the source parameter template.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Parameter list. 
     * @return ParamList Parameter list.
     */
    public InstanceParam [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set Parameter list.
     * @param ParamList Parameter list.
     */
    public void setParamList(InstanceParam [] ParamList) {
        this.ParamList = ParamList;
    }

    public CreateParamTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateParamTemplateRequest(CreateParamTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ParamList != null) {
            this.ParamList = new InstanceParam[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new InstanceParam(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

