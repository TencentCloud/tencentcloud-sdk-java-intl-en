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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunInstancesRequest extends AbstractModel{

    /**
    * List of AZs in which to create instances, the number of instances to be created, and the ISPs. You can create up to 100 instances in a region at a time.
    */
    @SerializedName("ZoneInstanceCountISPSet")
    @Expose
    private ZoneInstanceCountISP [] ZoneInstanceCountISPSet;

    /**
    * Instance login password. Different OS types have different limits on password complexity as detailed below:
The password of a Linux instance must contain 8–30 characters in at least two of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]. The password of a Windows instance must contain 12–30 characters in at least three of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /].
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Public network outbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthIn` will be used
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Module ID. If you don't specify this parameter, you must specify the `ImageId`, `InstanceType`, `DataDiskSize`, and `InternetMaxBandwidthOut` parameters
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Image ID. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Instance display name.
If this parameter is not specified, `Not named` will be displayed by default.
If you purchase multiple instances and specify the pattern string `{R:x}`, display names will be generated based on `[x, x+n-1]`, where `n` is the number of the purchased instances. For example, if you specify `server\_{R:3}` and purchase 1 instance, the display name will be `server\_3`, and if you purchase 2 instances, the display names will be `server\_3` and `server\_4` respectively.
You can specify multiple pattern strings `{R:x}`.
If you purchase multiple instances and don't specify the pattern string, the instance display names will be suffixed with 1, 2...n, where `n` indicates the number of the purchased instances. For example, if you specify `server_` and purchase 2 instances, the instance display names will be `server\_1` and `server\_2` respectively.
If the purchased instances belong to different regions or ISPs, the above rules will apply to each region and ISP independently.
It can contain up to 60 characters (including pattern string).
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Server name
`HostName` cannot start or end with a dot or hyphen and cannot contain consecutive dots or hyphens.
Windows instance: the name can contain 2–15 letters, digits, and hyphens but not dots or only digits.
Other types (such as Linux) of instances: the name should be a combination of 2 to 60 characters, supporting multiple dots. A string between two dots can contain letters, digits, and hyphens.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * The string used to ensure the idempotency of the request. Currently, it is a reserved parameter; therefore, do not use it.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled for public images by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Tag list
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * The user data provided to the instance, which needs to be Base64-encoded with a maximum size of 16 KB
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Model. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Data disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

    /**
    * Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API. If this parameter is not specified, the default security group will be bound by default.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * System disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * Public network inbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthOut` will be used
    */
    @SerializedName("InternetMaxBandwidthIn")
    @Expose
    private Long InternetMaxBandwidthIn;

    /**
    * Instance billing type. Valid values:
0: postpaid by resource usage, where the daily peak usage of the CPU, memory, and disk will be calculated. This billing mode applies only to non-GNR models;
1: hourly postpaid at the unit price of xx USD/instance/hour. This billing mode applies only to GNR models. To enable it, submit a ticket for application;
2: monthly postpaid at the unit price of xx USD/instance/month. This billing mode applies only to GNR models;
If this field is left empty, `0` will be selected by default for non-GNR models, and `2` will be selected by default for GNR models.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * Key pair.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

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
    * System disk information.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Data disk information.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
     * Get List of AZs in which to create instances, the number of instances to be created, and the ISPs. You can create up to 100 instances in a region at a time. 
     * @return ZoneInstanceCountISPSet List of AZs in which to create instances, the number of instances to be created, and the ISPs. You can create up to 100 instances in a region at a time.
     */
    public ZoneInstanceCountISP [] getZoneInstanceCountISPSet() {
        return this.ZoneInstanceCountISPSet;
    }

    /**
     * Set List of AZs in which to create instances, the number of instances to be created, and the ISPs. You can create up to 100 instances in a region at a time.
     * @param ZoneInstanceCountISPSet List of AZs in which to create instances, the number of instances to be created, and the ISPs. You can create up to 100 instances in a region at a time.
     */
    public void setZoneInstanceCountISPSet(ZoneInstanceCountISP [] ZoneInstanceCountISPSet) {
        this.ZoneInstanceCountISPSet = ZoneInstanceCountISPSet;
    }

    /**
     * Get Instance login password. Different OS types have different limits on password complexity as detailed below:
The password of a Linux instance must contain 8–30 characters in at least two of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]. The password of a Windows instance must contain 12–30 characters in at least three of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /]. 
     * @return Password Instance login password. Different OS types have different limits on password complexity as detailed below:
The password of a Linux instance must contain 8–30 characters in at least two of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]. The password of a Windows instance must contain 12–30 characters in at least three of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /].
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance login password. Different OS types have different limits on password complexity as detailed below:
The password of a Linux instance must contain 8–30 characters in at least two of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]. The password of a Windows instance must contain 12–30 characters in at least three of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /].
     * @param Password Instance login password. Different OS types have different limits on password complexity as detailed below:
The password of a Linux instance must contain 8–30 characters in at least two of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? / ]. The password of a Windows instance must contain 12–30 characters in at least three of the following character types: letters, digits, and special symbols [( ) ` ~ ! @ # $ % ^ & - + = | { } [ ] : ; ' , . ? /].
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Public network outbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthIn` will be used 
     * @return InternetMaxBandwidthOut Public network outbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthIn` will be used
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Public network outbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthIn` will be used
     * @param InternetMaxBandwidthOut Public network outbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthIn` will be used
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Module ID. If you don't specify this parameter, you must specify the `ImageId`, `InstanceType`, `DataDiskSize`, and `InternetMaxBandwidthOut` parameters 
     * @return ModuleId Module ID. If you don't specify this parameter, you must specify the `ImageId`, `InstanceType`, `DataDiskSize`, and `InternetMaxBandwidthOut` parameters
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set Module ID. If you don't specify this parameter, you must specify the `ImageId`, `InstanceType`, `DataDiskSize`, and `InternetMaxBandwidthOut` parameters
     * @param ModuleId Module ID. If you don't specify this parameter, you must specify the `ImageId`, `InstanceType`, `DataDiskSize`, and `InternetMaxBandwidthOut` parameters
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get Image ID. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used. 
     * @return ImageId Image ID. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used.
     * @param ImageId Image ID. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Instance display name.
If this parameter is not specified, `Not named` will be displayed by default.
If you purchase multiple instances and specify the pattern string `{R:x}`, display names will be generated based on `[x, x+n-1]`, where `n` is the number of the purchased instances. For example, if you specify `server\_{R:3}` and purchase 1 instance, the display name will be `server\_3`, and if you purchase 2 instances, the display names will be `server\_3` and `server\_4` respectively.
You can specify multiple pattern strings `{R:x}`.
If you purchase multiple instances and don't specify the pattern string, the instance display names will be suffixed with 1, 2...n, where `n` indicates the number of the purchased instances. For example, if you specify `server_` and purchase 2 instances, the instance display names will be `server\_1` and `server\_2` respectively.
If the purchased instances belong to different regions or ISPs, the above rules will apply to each region and ISP independently.
It can contain up to 60 characters (including pattern string). 
     * @return InstanceName Instance display name.
If this parameter is not specified, `Not named` will be displayed by default.
If you purchase multiple instances and specify the pattern string `{R:x}`, display names will be generated based on `[x, x+n-1]`, where `n` is the number of the purchased instances. For example, if you specify `server\_{R:3}` and purchase 1 instance, the display name will be `server\_3`, and if you purchase 2 instances, the display names will be `server\_3` and `server\_4` respectively.
You can specify multiple pattern strings `{R:x}`.
If you purchase multiple instances and don't specify the pattern string, the instance display names will be suffixed with 1, 2...n, where `n` indicates the number of the purchased instances. For example, if you specify `server_` and purchase 2 instances, the instance display names will be `server\_1` and `server\_2` respectively.
If the purchased instances belong to different regions or ISPs, the above rules will apply to each region and ISP independently.
It can contain up to 60 characters (including pattern string).
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance display name.
If this parameter is not specified, `Not named` will be displayed by default.
If you purchase multiple instances and specify the pattern string `{R:x}`, display names will be generated based on `[x, x+n-1]`, where `n` is the number of the purchased instances. For example, if you specify `server\_{R:3}` and purchase 1 instance, the display name will be `server\_3`, and if you purchase 2 instances, the display names will be `server\_3` and `server\_4` respectively.
You can specify multiple pattern strings `{R:x}`.
If you purchase multiple instances and don't specify the pattern string, the instance display names will be suffixed with 1, 2...n, where `n` indicates the number of the purchased instances. For example, if you specify `server_` and purchase 2 instances, the instance display names will be `server\_1` and `server\_2` respectively.
If the purchased instances belong to different regions or ISPs, the above rules will apply to each region and ISP independently.
It can contain up to 60 characters (including pattern string).
     * @param InstanceName Instance display name.
If this parameter is not specified, `Not named` will be displayed by default.
If you purchase multiple instances and specify the pattern string `{R:x}`, display names will be generated based on `[x, x+n-1]`, where `n` is the number of the purchased instances. For example, if you specify `server\_{R:3}` and purchase 1 instance, the display name will be `server\_3`, and if you purchase 2 instances, the display names will be `server\_3` and `server\_4` respectively.
You can specify multiple pattern strings `{R:x}`.
If you purchase multiple instances and don't specify the pattern string, the instance display names will be suffixed with 1, 2...n, where `n` indicates the number of the purchased instances. For example, if you specify `server_` and purchase 2 instances, the instance display names will be `server\_1` and `server\_2` respectively.
If the purchased instances belong to different regions or ISPs, the above rules will apply to each region and ISP independently.
It can contain up to 60 characters (including pattern string).
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Server name
`HostName` cannot start or end with a dot or hyphen and cannot contain consecutive dots or hyphens.
Windows instance: the name can contain 2–15 letters, digits, and hyphens but not dots or only digits.
Other types (such as Linux) of instances: the name should be a combination of 2 to 60 characters, supporting multiple dots. A string between two dots can contain letters, digits, and hyphens. 
     * @return HostName Server name
`HostName` cannot start or end with a dot or hyphen and cannot contain consecutive dots or hyphens.
Windows instance: the name can contain 2–15 letters, digits, and hyphens but not dots or only digits.
Other types (such as Linux) of instances: the name should be a combination of 2 to 60 characters, supporting multiple dots. A string between two dots can contain letters, digits, and hyphens.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
`HostName` cannot start or end with a dot or hyphen and cannot contain consecutive dots or hyphens.
Windows instance: the name can contain 2–15 letters, digits, and hyphens but not dots or only digits.
Other types (such as Linux) of instances: the name should be a combination of 2 to 60 characters, supporting multiple dots. A string between two dots can contain letters, digits, and hyphens.
     * @param HostName Server name
`HostName` cannot start or end with a dot or hyphen and cannot contain consecutive dots or hyphens.
Windows instance: the name can contain 2–15 letters, digits, and hyphens but not dots or only digits.
Other types (such as Linux) of instances: the name should be a combination of 2 to 60 characters, supporting multiple dots. A string between two dots can contain letters, digits, and hyphens.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get The string used to ensure the idempotency of the request. Currently, it is a reserved parameter; therefore, do not use it. 
     * @return ClientToken The string used to ensure the idempotency of the request. Currently, it is a reserved parameter; therefore, do not use it.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set The string used to ensure the idempotency of the request. Currently, it is a reserved parameter; therefore, do not use it.
     * @param ClientToken The string used to ensure the idempotency of the request. Currently, it is a reserved parameter; therefore, do not use it.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled for public images by default. 
     * @return EnhancedService Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled for public images by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled for public images by default.
     * @param EnhancedService Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled for public images by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get Tag list 
     * @return TagSpecification Tag list
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Tag list
     * @param TagSpecification Tag list
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get The user data provided to the instance, which needs to be Base64-encoded with a maximum size of 16 KB 
     * @return UserData The user data provided to the instance, which needs to be Base64-encoded with a maximum size of 16 KB
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set The user data provided to the instance, which needs to be Base64-encoded with a maximum size of 16 KB
     * @param UserData The user data provided to the instance, which needs to be Base64-encoded with a maximum size of 16 KB
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get Model. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used. 
     * @return InstanceType Model. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Model. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used.
     * @param InstanceType Model. If you don't specify this parameter or specify it as null, the default value under the corresponding module will be used.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Data disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used 
     * @return DataDiskSize Data disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set Data disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used
     * @param DataDiskSize Data disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API. If this parameter is not specified, the default security group will be bound by default. 
     * @return SecurityGroupIds Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API. If this parameter is not specified, the default security group will be bound by default.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API. If this parameter is not specified, the default security group will be bound by default.
     * @param SecurityGroupIds Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API. If this parameter is not specified, the default security group will be bound by default.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get System disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used 
     * @return SystemDiskSize System disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set System disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used
     * @param SystemDiskSize System disk size in GB. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get Public network inbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthOut` will be used 
     * @return InternetMaxBandwidthIn Public network inbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthOut` will be used
     */
    public Long getInternetMaxBandwidthIn() {
        return this.InternetMaxBandwidthIn;
    }

    /**
     * Set Public network inbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthOut` will be used
     * @param InternetMaxBandwidthIn Public network inbound bandwidth cap in Mbps.
1. If you don't specify this parameter or specify it as `0`, the default value under the corresponding module will be used.
2. If you don't specify this parameter or specify it as `0` without specifying the module, the value of `InternetMaxBandwidthOut` will be used
     */
    public void setInternetMaxBandwidthIn(Long InternetMaxBandwidthIn) {
        this.InternetMaxBandwidthIn = InternetMaxBandwidthIn;
    }

    /**
     * Get Instance billing type. Valid values:
0: postpaid by resource usage, where the daily peak usage of the CPU, memory, and disk will be calculated. This billing mode applies only to non-GNR models;
1: hourly postpaid at the unit price of xx USD/instance/hour. This billing mode applies only to GNR models. To enable it, submit a ticket for application;
2: monthly postpaid at the unit price of xx USD/instance/month. This billing mode applies only to GNR models;
If this field is left empty, `0` will be selected by default for non-GNR models, and `2` will be selected by default for GNR models. 
     * @return InstanceChargeType Instance billing type. Valid values:
0: postpaid by resource usage, where the daily peak usage of the CPU, memory, and disk will be calculated. This billing mode applies only to non-GNR models;
1: hourly postpaid at the unit price of xx USD/instance/hour. This billing mode applies only to GNR models. To enable it, submit a ticket for application;
2: monthly postpaid at the unit price of xx USD/instance/month. This billing mode applies only to GNR models;
If this field is left empty, `0` will be selected by default for non-GNR models, and `2` will be selected by default for GNR models.
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type. Valid values:
0: postpaid by resource usage, where the daily peak usage of the CPU, memory, and disk will be calculated. This billing mode applies only to non-GNR models;
1: hourly postpaid at the unit price of xx USD/instance/hour. This billing mode applies only to GNR models. To enable it, submit a ticket for application;
2: monthly postpaid at the unit price of xx USD/instance/month. This billing mode applies only to GNR models;
If this field is left empty, `0` will be selected by default for non-GNR models, and `2` will be selected by default for GNR models.
     * @param InstanceChargeType Instance billing type. Valid values:
0: postpaid by resource usage, where the daily peak usage of the CPU, memory, and disk will be calculated. This billing mode applies only to non-GNR models;
1: hourly postpaid at the unit price of xx USD/instance/hour. This billing mode applies only to GNR models. To enable it, submit a ticket for application;
2: monthly postpaid at the unit price of xx USD/instance/month. This billing mode applies only to GNR models;
If this field is left empty, `0` will be selected by default for non-GNR models, and `2` will be selected by default for GNR models.
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Key pair. 
     * @return KeyIds Key pair.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set Key pair.
     * @param KeyIds Key pair.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
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

    /**
     * Get System disk information. 
     * @return SystemDisk System disk information.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk information.
     * @param SystemDisk System disk information.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Data disk information. 
     * @return DataDisks Data disk information.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Data disk information.
     * @param DataDisks Data disk information.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    public RunInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunInstancesRequest(RunInstancesRequest source) {
        if (source.ZoneInstanceCountISPSet != null) {
            this.ZoneInstanceCountISPSet = new ZoneInstanceCountISP[source.ZoneInstanceCountISPSet.length];
            for (int i = 0; i < source.ZoneInstanceCountISPSet.length; i++) {
                this.ZoneInstanceCountISPSet[i] = new ZoneInstanceCountISP(source.ZoneInstanceCountISPSet[i]);
            }
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DataDiskSize != null) {
            this.DataDiskSize = new Long(source.DataDiskSize);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.SystemDiskSize != null) {
            this.SystemDiskSize = new Long(source.SystemDiskSize);
        }
        if (source.InternetMaxBandwidthIn != null) {
            this.InternetMaxBandwidthIn = new Long(source.InternetMaxBandwidthIn);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.KeepImageLogin != null) {
            this.KeepImageLogin = new String(source.KeepImageLogin);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ZoneInstanceCountISPSet.", this.ZoneInstanceCountISPSet);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthIn", this.InternetMaxBandwidthIn);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "KeepImageLogin", this.KeepImageLogin);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);

    }
}

