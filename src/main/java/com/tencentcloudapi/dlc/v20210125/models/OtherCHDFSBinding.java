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

public class OtherCHDFSBinding extends AbstractModel {

    /**
    * Product name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * User name (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuperUser")
    @Expose
    private String [] SuperUser;

    /**
    * VPC configuration information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcInfo")
    @Expose
    private CHDFSProductVpcInfo [] VpcInfo;

    /**
    * Whether to bind the bucket (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsBind")
    @Expose
    private Boolean IsBind;

    /**
     * Get Product name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductName Product name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductName Product name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get User name (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuperUser User name (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSuperUser() {
        return this.SuperUser;
    }

    /**
     * Set User name (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuperUser User name (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuperUser(String [] SuperUser) {
        this.SuperUser = SuperUser;
    }

    /**
     * Get VPC configuration information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcInfo VPC configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CHDFSProductVpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set VPC configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcInfo VPC configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcInfo(CHDFSProductVpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get Whether to bind the bucket (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsBind Whether to bind the bucket (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsBind() {
        return this.IsBind;
    }

    /**
     * Set Whether to bind the bucket (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsBind Whether to bind the bucket (a discarded field)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsBind(Boolean IsBind) {
        this.IsBind = IsBind;
    }

    public OtherCHDFSBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherCHDFSBinding(OtherCHDFSBinding source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SuperUser != null) {
            this.SuperUser = new String[source.SuperUser.length];
            for (int i = 0; i < source.SuperUser.length; i++) {
                this.SuperUser[i] = new String(source.SuperUser[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new CHDFSProductVpcInfo[source.VpcInfo.length];
            for (int i = 0; i < source.VpcInfo.length; i++) {
                this.VpcInfo[i] = new CHDFSProductVpcInfo(source.VpcInfo[i]);
            }
        }
        if (source.IsBind != null) {
            this.IsBind = new Boolean(source.IsBind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamArraySimple(map, prefix + "SuperUser.", this.SuperUser);
        this.setParamArrayObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "IsBind", this.IsBind);

    }
}

