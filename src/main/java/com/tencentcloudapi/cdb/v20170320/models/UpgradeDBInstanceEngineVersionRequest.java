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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceEngineVersionRequest extends AbstractModel{

    /**
    * Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) to query the ID, whose value is the `InstanceId` value in output parameters.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Version of primary instance database engine. Value range: 5.6, 5.7
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Mode of switch to a new instance. Value range: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [switching to new instance API](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) to trigger the process.
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * Whether to upgrade kernel minor version. Valid values: 1 (upgrade kernel minor version), 0 (upgrade database engine).
    */
    @SerializedName("UpgradeSubversion")
    @Expose
    private Long UpgradeSubversion;

    /**
    * Delay threshold. Value range: 1-10
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) to query the ID, whose value is the `InstanceId` value in output parameters. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) to query the ID, whose value is the `InstanceId` value in output parameters.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) to query the ID, whose value is the `InstanceId` value in output parameters.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) to query the ID, whose value is the `InstanceId` value in output parameters.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Version of primary instance database engine. Value range: 5.6, 5.7 
     * @return EngineVersion Version of primary instance database engine. Value range: 5.6, 5.7
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Version of primary instance database engine. Value range: 5.6, 5.7
     * @param EngineVersion Version of primary instance database engine. Value range: 5.6, 5.7
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Mode of switch to a new instance. Value range: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [switching to new instance API](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) to trigger the process. 
     * @return WaitSwitch Mode of switch to a new instance. Value range: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [switching to new instance API](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) to trigger the process.
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set Mode of switch to a new instance. Value range: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [switching to new instance API](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) to trigger the process.
     * @param WaitSwitch Mode of switch to a new instance. Value range: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [switching to new instance API](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) to trigger the process.
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get Whether to upgrade kernel minor version. Valid values: 1 (upgrade kernel minor version), 0 (upgrade database engine). 
     * @return UpgradeSubversion Whether to upgrade kernel minor version. Valid values: 1 (upgrade kernel minor version), 0 (upgrade database engine).
     */
    public Long getUpgradeSubversion() {
        return this.UpgradeSubversion;
    }

    /**
     * Set Whether to upgrade kernel minor version. Valid values: 1 (upgrade kernel minor version), 0 (upgrade database engine).
     * @param UpgradeSubversion Whether to upgrade kernel minor version. Valid values: 1 (upgrade kernel minor version), 0 (upgrade database engine).
     */
    public void setUpgradeSubversion(Long UpgradeSubversion) {
        this.UpgradeSubversion = UpgradeSubversion;
    }

    /**
     * Get Delay threshold. Value range: 1-10 
     * @return MaxDelayTime Delay threshold. Value range: 1-10
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set Delay threshold. Value range: 1-10
     * @param MaxDelayTime Delay threshold. Value range: 1-10
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
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

    }
}

