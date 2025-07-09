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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstancesRequest extends AbstractModel {

    /**
    * List of IDs of the instances to be reinstalled.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * ID of the image from which to install the instance. If this parameter is not specified, the current image of the instance will be used.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Password. If this parameter is not specified, the password will be subsequently displayed in the Message Center.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Whether to enable CM and CWP. If this parameter is not specified, they will be enabled by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Whether to retain the data on the data disk. Valid values: true, false. Default value: true
    */
    @SerializedName("KeepData")
    @Expose
    private String KeepData;

    /**
    * Whether to keep the original settings for the image. You cannot specify this parameter if `Password` or `KeyIds.N` is specified. You can specify this parameter as `TRUE` only when you create an instance by using a custom image, shared image, or image imported from an external resource. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeepImageLogin")
    @Expose
    private String KeepImageLogin;

    /**
     * Get List of IDs of the instances to be reinstalled. 
     * @return InstanceIdSet List of IDs of the instances to be reinstalled.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of IDs of the instances to be reinstalled.
     * @param InstanceIdSet List of IDs of the instances to be reinstalled.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get ID of the image from which to install the instance. If this parameter is not specified, the current image of the instance will be used. 
     * @return ImageId ID of the image from which to install the instance. If this parameter is not specified, the current image of the instance will be used.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set ID of the image from which to install the instance. If this parameter is not specified, the current image of the instance will be used.
     * @param ImageId ID of the image from which to install the instance. If this parameter is not specified, the current image of the instance will be used.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Password. If this parameter is not specified, the password will be subsequently displayed in the Message Center. 
     * @return Password Password. If this parameter is not specified, the password will be subsequently displayed in the Message Center.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password. If this parameter is not specified, the password will be subsequently displayed in the Message Center.
     * @param Password Password. If this parameter is not specified, the password will be subsequently displayed in the Message Center.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Whether to enable CM and CWP. If this parameter is not specified, they will be enabled by default. 
     * @return EnhancedService Whether to enable CM and CWP. If this parameter is not specified, they will be enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Whether to enable CM and CWP. If this parameter is not specified, they will be enabled by default.
     * @param EnhancedService Whether to enable CM and CWP. If this parameter is not specified, they will be enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get Whether to retain the data on the data disk. Valid values: true, false. Default value: true 
     * @return KeepData Whether to retain the data on the data disk. Valid values: true, false. Default value: true
     */
    public String getKeepData() {
        return this.KeepData;
    }

    /**
     * Set Whether to retain the data on the data disk. Valid values: true, false. Default value: true
     * @param KeepData Whether to retain the data on the data disk. Valid values: true, false. Default value: true
     */
    public void setKeepData(String KeepData) {
        this.KeepData = KeepData;
    }

    /**
     * Get Whether to keep the original settings for the image. You cannot specify this parameter if `Password` or `KeyIds.N` is specified. You can specify this parameter as `TRUE` only when you create an instance by using a custom image, shared image, or image imported from an external resource. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeepImageLogin Whether to keep the original settings for the image. You cannot specify this parameter if `Password` or `KeyIds.N` is specified. You can specify this parameter as `TRUE` only when you create an instance by using a custom image, shared image, or image imported from an external resource. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeepImageLogin() {
        return this.KeepImageLogin;
    }

    /**
     * Set Whether to keep the original settings for the image. You cannot specify this parameter if `Password` or `KeyIds.N` is specified. You can specify this parameter as `TRUE` only when you create an instance by using a custom image, shared image, or image imported from an external resource. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeepImageLogin Whether to keep the original settings for the image. You cannot specify this parameter if `Password` or `KeyIds.N` is specified. You can specify this parameter as `TRUE` only when you create an instance by using a custom image, shared image, or image imported from an external resource. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeepImageLogin(String KeepImageLogin) {
        this.KeepImageLogin = KeepImageLogin;
    }

    public ResetInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstancesRequest(ResetInstancesRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.KeepData != null) {
            this.KeepData = new String(source.KeepData);
        }
        if (source.KeepImageLogin != null) {
            this.KeepImageLogin = new String(source.KeepImageLogin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "KeepData", this.KeepData);
        this.setParamSimple(map, prefix + "KeepImageLogin", this.KeepImageLogin);

    }
}

