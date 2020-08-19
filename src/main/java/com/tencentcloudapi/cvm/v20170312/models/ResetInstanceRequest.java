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

public class ResetInstanceRequest extends AbstractModel{

    /**
    * Instance ID. To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specified effective [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are four types of images:<br/><li>Public images</li><li>Custom images</li><li>Shared images</li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways:<br/><li>for IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); for IDs of `marketplace images`, go to [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Call the API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
<br>Default value: current image.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * System disk configurations in the instance. For instances with a cloud disk as the system disk, you can expand the capacity of the system disk to the specified value after re-installation by using this parameter. If the parameter is not specified, lower system disk capacity will be automatically expanded to the image size, and extra disk costs are generated. You can only expand but cannot reduce the system disk capacity. By re-installing the system, you only modify the system disk capacity, but not the type.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance or keep the login settings of the original image. By default, a random password will be generated and sent to you via the Message Center.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Monitor and Cloud Security. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Host name of the CVM, editable during the system reinstallation. <br><li>Periods (.) or hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name.<br><li>For Windows instances, the host name must consist of 2-15 characters , including uppercase and lowercase letters, numbers, or hyphens (-). It cannot contain periods (.) or contain only numbers.<br><li>For other instances, such as Linux instances, the host name must consist of 2-60 characters, including multiple periods (.), and allows uppercase and lowercase letters, numbers, or hyphens (-) between any two periods (.).
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
     * Get Instance ID. To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. 
     * @return InstanceId Instance ID. To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response.
     * @param InstanceId Instance ID. To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specified effective [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are four types of images:<br/><li>Public images</li><li>Custom images</li><li>Shared images</li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways:<br/><li>for IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); for IDs of `marketplace images`, go to [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Call the API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
<br>Default value: current image. 
     * @return ImageId Specified effective [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are four types of images:<br/><li>Public images</li><li>Custom images</li><li>Shared images</li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways:<br/><li>for IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); for IDs of `marketplace images`, go to [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Call the API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
<br>Default value: current image.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Specified effective [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are four types of images:<br/><li>Public images</li><li>Custom images</li><li>Shared images</li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways:<br/><li>for IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); for IDs of `marketplace images`, go to [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Call the API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
<br>Default value: current image.
     * @param ImageId Specified effective [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are four types of images:<br/><li>Public images</li><li>Custom images</li><li>Shared images</li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways:<br/><li>for IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); for IDs of `marketplace images`, go to [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Call the API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
<br>Default value: current image.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get System disk configurations in the instance. For instances with a cloud disk as the system disk, you can expand the capacity of the system disk to the specified value after re-installation by using this parameter. If the parameter is not specified, lower system disk capacity will be automatically expanded to the image size, and extra disk costs are generated. You can only expand but cannot reduce the system disk capacity. By re-installing the system, you only modify the system disk capacity, but not the type. 
     * @return SystemDisk System disk configurations in the instance. For instances with a cloud disk as the system disk, you can expand the capacity of the system disk to the specified value after re-installation by using this parameter. If the parameter is not specified, lower system disk capacity will be automatically expanded to the image size, and extra disk costs are generated. You can only expand but cannot reduce the system disk capacity. By re-installing the system, you only modify the system disk capacity, but not the type.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk configurations in the instance. For instances with a cloud disk as the system disk, you can expand the capacity of the system disk to the specified value after re-installation by using this parameter. If the parameter is not specified, lower system disk capacity will be automatically expanded to the image size, and extra disk costs are generated. You can only expand but cannot reduce the system disk capacity. By re-installing the system, you only modify the system disk capacity, but not the type.
     * @param SystemDisk System disk configurations in the instance. For instances with a cloud disk as the system disk, you can expand the capacity of the system disk to the specified value after re-installation by using this parameter. If the parameter is not specified, lower system disk capacity will be automatically expanded to the image size, and extra disk costs are generated. You can only expand but cannot reduce the system disk capacity. By re-installing the system, you only modify the system disk capacity, but not the type.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance or keep the login settings of the original image. By default, a random password will be generated and sent to you via the Message Center. 
     * @return LoginSettings Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance or keep the login settings of the original image. By default, a random password will be generated and sent to you via the Message Center.
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance or keep the login settings of the original image. By default, a random password will be generated and sent to you via the Message Center.
     * @param LoginSettings Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance or keep the login settings of the original image. By default, a random password will be generated and sent to you via the Message Center.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Monitor and Cloud Security. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default. 
     * @return EnhancedService Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Monitor and Cloud Security. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Monitor and Cloud Security. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default.
     * @param EnhancedService Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Monitor and Cloud Security. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get Host name of the CVM, editable during the system reinstallation. <br><li>Periods (.) or hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name.<br><li>For Windows instances, the host name must consist of 2-15 characters , including uppercase and lowercase letters, numbers, or hyphens (-). It cannot contain periods (.) or contain only numbers.<br><li>For other instances, such as Linux instances, the host name must consist of 2-60 characters, including multiple periods (.), and allows uppercase and lowercase letters, numbers, or hyphens (-) between any two periods (.). 
     * @return HostName Host name of the CVM, editable during the system reinstallation. <br><li>Periods (.) or hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name.<br><li>For Windows instances, the host name must consist of 2-15 characters , including uppercase and lowercase letters, numbers, or hyphens (-). It cannot contain periods (.) or contain only numbers.<br><li>For other instances, such as Linux instances, the host name must consist of 2-60 characters, including multiple periods (.), and allows uppercase and lowercase letters, numbers, or hyphens (-) between any two periods (.).
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name of the CVM, editable during the system reinstallation. <br><li>Periods (.) or hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name.<br><li>For Windows instances, the host name must consist of 2-15 characters , including uppercase and lowercase letters, numbers, or hyphens (-). It cannot contain periods (.) or contain only numbers.<br><li>For other instances, such as Linux instances, the host name must consist of 2-60 characters, including multiple periods (.), and allows uppercase and lowercase letters, numbers, or hyphens (-) between any two periods (.).
     * @param HostName Host name of the CVM, editable during the system reinstallation. <br><li>Periods (.) or hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name.<br><li>For Windows instances, the host name must consist of 2-15 characters , including uppercase and lowercase letters, numbers, or hyphens (-). It cannot contain periods (.) or contain only numbers.<br><li>For other instances, such as Linux instances, the host name must consist of 2-60 characters, including multiple periods (.), and allows uppercase and lowercase letters, numbers, or hyphens (-) between any two periods (.).
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "HostName", this.HostName);

    }
}

