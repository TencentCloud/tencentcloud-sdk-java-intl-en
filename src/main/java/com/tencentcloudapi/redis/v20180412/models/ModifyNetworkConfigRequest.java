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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Network change type. Valid values:
- `changeVip`: VPC change, including the private IPv4 address and port.
- `changeVpc`: Subnet change.
- `changeBaseToVpc`: Change from classic network to VPC.
- `changeVPort`: Port change.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Private IPv4 address of the instance, which is required if `Operation` is `changeVip`.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * VPC ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Retention period of the original private IPv4 address
- Unit: Days.
- Valid values: `0`, `1`, `2`, `3`, `7`, `15`.

**Note**: You can set the retention period of the original address only in the latest SDK. In earlier SDKs, the original address is released immediately. To view the SDK version, go to [SDK Center](https://intl.cloud.tencent.com/document/sdk?from_cn_redirect=1).
    */
    @SerializedName("Recycle")
    @Expose
    private Long Recycle;

    /**
    * Network port after the change, which is required if `Operation` is `changeVPort` or `changeVip`. Value range: [1024,65535].
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Network change type. Valid values:
- `changeVip`: VPC change, including the private IPv4 address and port.
- `changeVpc`: Subnet change.
- `changeBaseToVpc`: Change from classic network to VPC.
- `changeVPort`: Port change. 
     * @return Operation Network change type. Valid values:
- `changeVip`: VPC change, including the private IPv4 address and port.
- `changeVpc`: Subnet change.
- `changeBaseToVpc`: Change from classic network to VPC.
- `changeVPort`: Port change.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Network change type. Valid values:
- `changeVip`: VPC change, including the private IPv4 address and port.
- `changeVpc`: Subnet change.
- `changeBaseToVpc`: Change from classic network to VPC.
- `changeVPort`: Port change.
     * @param Operation Network change type. Valid values:
- `changeVip`: VPC change, including the private IPv4 address and port.
- `changeVpc`: Subnet change.
- `changeBaseToVpc`: Change from classic network to VPC.
- `changeVPort`: Port change.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Private IPv4 address of the instance, which is required if `Operation` is `changeVip`. 
     * @return Vip Private IPv4 address of the instance, which is required if `Operation` is `changeVip`.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IPv4 address of the instance, which is required if `Operation` is `changeVip`.
     * @param Vip Private IPv4 address of the instance, which is required if `Operation` is `changeVip`.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get VPC ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`. 
     * @return VpcId VPC ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`.
     * @param VpcId VPC ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`. 
     * @return SubnetId Subnet ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`.
     * @param SubnetId Subnet ID after the change, which is required if `Operation` is `changeVpc` or `changeBaseToVpc`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Retention period of the original private IPv4 address
- Unit: Days.
- Valid values: `0`, `1`, `2`, `3`, `7`, `15`.

**Note**: You can set the retention period of the original address only in the latest SDK. In earlier SDKs, the original address is released immediately. To view the SDK version, go to [SDK Center](https://intl.cloud.tencent.com/document/sdk?from_cn_redirect=1). 
     * @return Recycle Retention period of the original private IPv4 address
- Unit: Days.
- Valid values: `0`, `1`, `2`, `3`, `7`, `15`.

**Note**: You can set the retention period of the original address only in the latest SDK. In earlier SDKs, the original address is released immediately. To view the SDK version, go to [SDK Center](https://intl.cloud.tencent.com/document/sdk?from_cn_redirect=1).
     */
    public Long getRecycle() {
        return this.Recycle;
    }

    /**
     * Set Retention period of the original private IPv4 address
- Unit: Days.
- Valid values: `0`, `1`, `2`, `3`, `7`, `15`.

**Note**: You can set the retention period of the original address only in the latest SDK. In earlier SDKs, the original address is released immediately. To view the SDK version, go to [SDK Center](https://intl.cloud.tencent.com/document/sdk?from_cn_redirect=1).
     * @param Recycle Retention period of the original private IPv4 address
- Unit: Days.
- Valid values: `0`, `1`, `2`, `3`, `7`, `15`.

**Note**: You can set the retention period of the original address only in the latest SDK. In earlier SDKs, the original address is released immediately. To view the SDK version, go to [SDK Center](https://intl.cloud.tencent.com/document/sdk?from_cn_redirect=1).
     */
    public void setRecycle(Long Recycle) {
        this.Recycle = Recycle;
    }

    /**
     * Get Network port after the change, which is required if `Operation` is `changeVPort` or `changeVip`. Value range: [1024,65535]. 
     * @return VPort Network port after the change, which is required if `Operation` is `changeVPort` or `changeVip`. Value range: [1024,65535].
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Network port after the change, which is required if `Operation` is `changeVPort` or `changeVip`. Value range: [1024,65535].
     * @param VPort Network port after the change, which is required if `Operation` is `changeVPort` or `changeVip`. Value range: [1024,65535].
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    public ModifyNetworkConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkConfigRequest(ModifyNetworkConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Recycle != null) {
            this.Recycle = new Long(source.Recycle);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Recycle", this.Recycle);
        this.setParamSimple(map, prefix + "VPort", this.VPort);

    }
}

