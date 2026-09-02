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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudFunctionItem extends AbstractModel {

    /**
    * Cloud function name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Function status
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Cloud function type
    */
    @SerializedName("FunctionType")
    @Expose
    private String FunctionType;

    /**
    * Resource tag
    */
    @SerializedName("InstanceTag")
    @Expose
    private String InstanceTag;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Custom domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Tenant ID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Displayed content of function status
    */
    @SerializedName("InstanceStatusDisplay")
    @Expose
    private String InstanceStatusDisplay;

    /**
    * Core asset tag
    */
    @SerializedName("CoreAssetFlag")
    @Expose
    private String CoreAssetFlag;

    /**
    * Public network access URL
    */
    @SerializedName("PublicURL")
    @Expose
    private String PublicURL;

    /**
    * VPC access URL
    */
    @SerializedName("PrivateURL")
    @Expose
    private String PrivateURL;

    /**
    * Account
    */
    @SerializedName("AccountInfo")
    @Expose
    private String AccountInfo;

    /**
     * Get Cloud function name 
     * @return InstanceName Cloud function name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Cloud function name
     * @param InstanceName Cloud function name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Function status 
     * @return InstanceStatus Function status
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Function status
     * @param InstanceStatus Function status
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Cloud function type 
     * @return FunctionType Cloud function type
     */
    public String getFunctionType() {
        return this.FunctionType;
    }

    /**
     * Set Cloud function type
     * @param FunctionType Cloud function type
     */
    public void setFunctionType(String FunctionType) {
        this.FunctionType = FunctionType;
    }

    /**
     * Get Resource tag 
     * @return InstanceTag Resource tag
     */
    public String getInstanceTag() {
        return this.InstanceTag;
    }

    /**
     * Set Resource tag
     * @param InstanceTag Resource tag
     */
    public void setInstanceTag(String InstanceTag) {
        this.InstanceTag = InstanceTag;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Custom domain name 
     * @return Domain Custom domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Custom domain name
     * @param Domain Custom domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Instance ID. 
     * @return InstanceID Instance ID.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID.
     * @param InstanceID Instance ID.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Tenant ID 
     * @return AppID Tenant ID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set Tenant ID
     * @param AppID Tenant ID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Displayed content of function status 
     * @return InstanceStatusDisplay Displayed content of function status
     */
    public String getInstanceStatusDisplay() {
        return this.InstanceStatusDisplay;
    }

    /**
     * Set Displayed content of function status
     * @param InstanceStatusDisplay Displayed content of function status
     */
    public void setInstanceStatusDisplay(String InstanceStatusDisplay) {
        this.InstanceStatusDisplay = InstanceStatusDisplay;
    }

    /**
     * Get Core asset tag 
     * @return CoreAssetFlag Core asset tag
     */
    public String getCoreAssetFlag() {
        return this.CoreAssetFlag;
    }

    /**
     * Set Core asset tag
     * @param CoreAssetFlag Core asset tag
     */
    public void setCoreAssetFlag(String CoreAssetFlag) {
        this.CoreAssetFlag = CoreAssetFlag;
    }

    /**
     * Get Public network access URL 
     * @return PublicURL Public network access URL
     */
    public String getPublicURL() {
        return this.PublicURL;
    }

    /**
     * Set Public network access URL
     * @param PublicURL Public network access URL
     */
    public void setPublicURL(String PublicURL) {
        this.PublicURL = PublicURL;
    }

    /**
     * Get VPC access URL 
     * @return PrivateURL VPC access URL
     */
    public String getPrivateURL() {
        return this.PrivateURL;
    }

    /**
     * Set VPC access URL
     * @param PrivateURL VPC access URL
     */
    public void setPrivateURL(String PrivateURL) {
        this.PrivateURL = PrivateURL;
    }

    /**
     * Get Account 
     * @return AccountInfo Account
     */
    public String getAccountInfo() {
        return this.AccountInfo;
    }

    /**
     * Set Account
     * @param AccountInfo Account
     */
    public void setAccountInfo(String AccountInfo) {
        this.AccountInfo = AccountInfo;
    }

    public CloudFunctionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudFunctionItem(CloudFunctionItem source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.FunctionType != null) {
            this.FunctionType = new String(source.FunctionType);
        }
        if (source.InstanceTag != null) {
            this.InstanceTag = new String(source.InstanceTag);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.InstanceStatusDisplay != null) {
            this.InstanceStatusDisplay = new String(source.InstanceStatusDisplay);
        }
        if (source.CoreAssetFlag != null) {
            this.CoreAssetFlag = new String(source.CoreAssetFlag);
        }
        if (source.PublicURL != null) {
            this.PublicURL = new String(source.PublicURL);
        }
        if (source.PrivateURL != null) {
            this.PrivateURL = new String(source.PrivateURL);
        }
        if (source.AccountInfo != null) {
            this.AccountInfo = new String(source.AccountInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "FunctionType", this.FunctionType);
        this.setParamSimple(map, prefix + "InstanceTag", this.InstanceTag);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "InstanceStatusDisplay", this.InstanceStatusDisplay);
        this.setParamSimple(map, prefix + "CoreAssetFlag", this.CoreAssetFlag);
        this.setParamSimple(map, prefix + "PublicURL", this.PublicURL);
        this.setParamSimple(map, prefix + "PrivateURL", this.PrivateURL);
        this.setParamSimple(map, prefix + "AccountInfo", this.AccountInfo);

    }
}

