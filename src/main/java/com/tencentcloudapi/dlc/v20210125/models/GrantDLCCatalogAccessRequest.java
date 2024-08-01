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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GrantDLCCatalogAccessRequest extends AbstractModel {

    /**
    * Authorized VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Product (EMR|DLC|Doris|Inlong|Wedata)
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * UIN of the account to which VPC belongs
    */
    @SerializedName("VpcUin")
    @Expose
    private String VpcUin;

    /**
    * AppId of the account to which VPC belongs
    */
    @SerializedName("VpcAppId")
    @Expose
    private Long VpcAppId;

    /**
     * Get Authorized VpcId 
     * @return VpcId Authorized VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Authorized VpcId
     * @param VpcId Authorized VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Product (EMR|DLC|Doris|Inlong|Wedata) 
     * @return Product Product (EMR|DLC|Doris|Inlong|Wedata)
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Product (EMR|DLC|Doris|Inlong|Wedata)
     * @param Product Product (EMR|DLC|Doris|Inlong|Wedata)
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get UIN of the account to which VPC belongs 
     * @return VpcUin UIN of the account to which VPC belongs
     */
    public String getVpcUin() {
        return this.VpcUin;
    }

    /**
     * Set UIN of the account to which VPC belongs
     * @param VpcUin UIN of the account to which VPC belongs
     */
    public void setVpcUin(String VpcUin) {
        this.VpcUin = VpcUin;
    }

    /**
     * Get AppId of the account to which VPC belongs 
     * @return VpcAppId AppId of the account to which VPC belongs
     */
    public Long getVpcAppId() {
        return this.VpcAppId;
    }

    /**
     * Set AppId of the account to which VPC belongs
     * @param VpcAppId AppId of the account to which VPC belongs
     */
    public void setVpcAppId(Long VpcAppId) {
        this.VpcAppId = VpcAppId;
    }

    public GrantDLCCatalogAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrantDLCCatalogAccessRequest(GrantDLCCatalogAccessRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VpcUin != null) {
            this.VpcUin = new String(source.VpcUin);
        }
        if (source.VpcAppId != null) {
            this.VpcAppId = new Long(source.VpcAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VpcUin", this.VpcUin);
        this.setParamSimple(map, prefix + "VpcAppId", this.VpcAppId);

    }
}

