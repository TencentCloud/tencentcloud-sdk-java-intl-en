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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceEngineVersionRequest extends AbstractModel {

    /**
    * <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Database engine version of the primary instance. Supported values include 5.6, 5.7, 8.0.<br>Description: Cross-version upgrade is not supported. Downgrade is not supported after upgrade.</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch in a time window. When the value is 1, during the upgrade process, the switchover to a new instance will be performed in the time window, or the user can proactively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">switch to a new instance</a> to trigger the process.</p>
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * <p>Whether to upgrade the kernel subversion. Supported values: 1 - upgrade kernel subversion; 0 - upgrade database engine version. No default value. Specify the version type to upgrade.</p>
    */
    @SerializedName("UpgradeSubversion")
    @Expose
    private Long UpgradeSubversion;

    /**
    * <p>Delay threshold. Value ranges from 1 to 10. No default value. When not specified, the delay threshold is 0, which means the delay threshold is not set.</p>
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
    * <p>Whether to ignore keyword errors when upgrading from 5.7 to 8.0. The value ranges from 0 to 1. 1 means ignored, 0 means not ignored. No default value. Not specified means no action taken.</p>
    */
    @SerializedName("IgnoreErrKeyword")
    @Expose
    private Long IgnoreErrKeyword;

    /**
    * <p>Upgrade support for specified parameters</p>
    */
    @SerializedName("ParamList")
    @Expose
    private UpgradeEngineVersionParams [] ParamList;

    /**
     * Get <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p> 
     * @return InstanceId <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p>
     * @param InstanceId <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Database engine version of the primary instance. Supported values include 5.6, 5.7, 8.0.<br>Description: Cross-version upgrade is not supported. Downgrade is not supported after upgrade.</p> 
     * @return EngineVersion <p>Database engine version of the primary instance. Supported values include 5.6, 5.7, 8.0.<br>Description: Cross-version upgrade is not supported. Downgrade is not supported after upgrade.</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>Database engine version of the primary instance. Supported values include 5.6, 5.7, 8.0.<br>Description: Cross-version upgrade is not supported. Downgrade is not supported after upgrade.</p>
     * @param EngineVersion <p>Database engine version of the primary instance. Supported values include 5.6, 5.7, 8.0.<br>Description: Cross-version upgrade is not supported. Downgrade is not supported after upgrade.</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch in a time window. When the value is 1, during the upgrade process, the switchover to a new instance will be performed in the time window, or the user can proactively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">switch to a new instance</a> to trigger the process.</p> 
     * @return WaitSwitch <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch in a time window. When the value is 1, during the upgrade process, the switchover to a new instance will be performed in the time window, or the user can proactively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">switch to a new instance</a> to trigger the process.</p>
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch in a time window. When the value is 1, during the upgrade process, the switchover to a new instance will be performed in the time window, or the user can proactively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">switch to a new instance</a> to trigger the process.</p>
     * @param WaitSwitch <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch in a time window. When the value is 1, during the upgrade process, the switchover to a new instance will be performed in the time window, or the user can proactively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">switch to a new instance</a> to trigger the process.</p>
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get <p>Whether to upgrade the kernel subversion. Supported values: 1 - upgrade kernel subversion; 0 - upgrade database engine version. No default value. Specify the version type to upgrade.</p> 
     * @return UpgradeSubversion <p>Whether to upgrade the kernel subversion. Supported values: 1 - upgrade kernel subversion; 0 - upgrade database engine version. No default value. Specify the version type to upgrade.</p>
     */
    public Long getUpgradeSubversion() {
        return this.UpgradeSubversion;
    }

    /**
     * Set <p>Whether to upgrade the kernel subversion. Supported values: 1 - upgrade kernel subversion; 0 - upgrade database engine version. No default value. Specify the version type to upgrade.</p>
     * @param UpgradeSubversion <p>Whether to upgrade the kernel subversion. Supported values: 1 - upgrade kernel subversion; 0 - upgrade database engine version. No default value. Specify the version type to upgrade.</p>
     */
    public void setUpgradeSubversion(Long UpgradeSubversion) {
        this.UpgradeSubversion = UpgradeSubversion;
    }

    /**
     * Get <p>Delay threshold. Value ranges from 1 to 10. No default value. When not specified, the delay threshold is 0, which means the delay threshold is not set.</p> 
     * @return MaxDelayTime <p>Delay threshold. Value ranges from 1 to 10. No default value. When not specified, the delay threshold is 0, which means the delay threshold is not set.</p>
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set <p>Delay threshold. Value ranges from 1 to 10. No default value. When not specified, the delay threshold is 0, which means the delay threshold is not set.</p>
     * @param MaxDelayTime <p>Delay threshold. Value ranges from 1 to 10. No default value. When not specified, the delay threshold is 0, which means the delay threshold is not set.</p>
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    /**
     * Get <p>Whether to ignore keyword errors when upgrading from 5.7 to 8.0. The value ranges from 0 to 1. 1 means ignored, 0 means not ignored. No default value. Not specified means no action taken.</p> 
     * @return IgnoreErrKeyword <p>Whether to ignore keyword errors when upgrading from 5.7 to 8.0. The value ranges from 0 to 1. 1 means ignored, 0 means not ignored. No default value. Not specified means no action taken.</p>
     */
    public Long getIgnoreErrKeyword() {
        return this.IgnoreErrKeyword;
    }

    /**
     * Set <p>Whether to ignore keyword errors when upgrading from 5.7 to 8.0. The value ranges from 0 to 1. 1 means ignored, 0 means not ignored. No default value. Not specified means no action taken.</p>
     * @param IgnoreErrKeyword <p>Whether to ignore keyword errors when upgrading from 5.7 to 8.0. The value ranges from 0 to 1. 1 means ignored, 0 means not ignored. No default value. Not specified means no action taken.</p>
     */
    public void setIgnoreErrKeyword(Long IgnoreErrKeyword) {
        this.IgnoreErrKeyword = IgnoreErrKeyword;
    }

    /**
     * Get <p>Upgrade support for specified parameters</p> 
     * @return ParamList <p>Upgrade support for specified parameters</p>
     */
    public UpgradeEngineVersionParams [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>Upgrade support for specified parameters</p>
     * @param ParamList <p>Upgrade support for specified parameters</p>
     */
    public void setParamList(UpgradeEngineVersionParams [] ParamList) {
        this.ParamList = ParamList;
    }

    public UpgradeDBInstanceEngineVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceEngineVersionRequest(UpgradeDBInstanceEngineVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.UpgradeSubversion != null) {
            this.UpgradeSubversion = new Long(source.UpgradeSubversion);
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
        if (source.IgnoreErrKeyword != null) {
            this.IgnoreErrKeyword = new Long(source.IgnoreErrKeyword);
        }
        if (source.ParamList != null) {
            this.ParamList = new UpgradeEngineVersionParams[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new UpgradeEngineVersionParams(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "UpgradeSubversion", this.UpgradeSubversion);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);
        this.setParamSimple(map, prefix + "IgnoreErrKeyword", this.IgnoreErrKeyword);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

