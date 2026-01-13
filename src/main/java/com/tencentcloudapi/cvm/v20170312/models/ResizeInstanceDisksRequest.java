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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResizeInstanceDisksRequest extends AbstractModel {

    /**
    * Instance ID to be operated. can be obtained from the `InstanceId` in the return value from the DescribeInstances api (https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the configuration information of the data disk to be expanded, only supporting specifying the target capacity of the disk to be expanded. only non-elastic data disks (with `Portable` being `false` in the return values of [DescribeDisks](https://www.tencentcloud.com/document/api/362/16315?from_cn_redirect=1)) can be expanded. the unit of data disk capacity is GiB. the minimum expansion step is 10 GiB. for data disk type selection, refer to [disk product introduction](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1). the available data disk type is restricted by the instance type `InstanceType`. additionally, the maximum allowable capacity for expansion varies by data disk type.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Specifies whether to forcibly shut down a running instance. it is recommended to manually shut down a running instance first and then expand the instance disk. valid values:<br><li>true: forcibly shut down an instance after a normal shutdown fails.</li><br><li>false: do not forcibly shut down an instance after a normal shutdown fails.</li><br><br>default value: false.<br><br>forced shutdown is equivalent to turning off a physical computer's power switch. forced shutdown may cause data loss or file system corruption and should only be used when a server cannot be shut down normally.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * System disk configuration information to be expanded. only supports specifying the purpose capacity of the disk to be expanded. only supports cloud disk expansion.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Whether the cloud disk is expanded online.
    */
    @SerializedName("ResizeOnline")
    @Expose
    private Boolean ResizeOnline;

    /**
     * Get Instance ID to be operated. can be obtained from the `InstanceId` in the return value from the DescribeInstances api (https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1). 
     * @return InstanceId Instance ID to be operated. can be obtained from the `InstanceId` in the return value from the DescribeInstances api (https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID to be operated. can be obtained from the `InstanceId` in the return value from the DescribeInstances api (https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1).
     * @param InstanceId Instance ID to be operated. can be obtained from the `InstanceId` in the return value from the DescribeInstances api (https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the configuration information of the data disk to be expanded, only supporting specifying the target capacity of the disk to be expanded. only non-elastic data disks (with `Portable` being `false` in the return values of [DescribeDisks](https://www.tencentcloud.com/document/api/362/16315?from_cn_redirect=1)) can be expanded. the unit of data disk capacity is GiB. the minimum expansion step is 10 GiB. for data disk type selection, refer to [disk product introduction](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1). the available data disk type is restricted by the instance type `InstanceType`. additionally, the maximum allowable capacity for expansion varies by data disk type.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert> 
     * @return DataDisks Specifies the configuration information of the data disk to be expanded, only supporting specifying the target capacity of the disk to be expanded. only non-elastic data disks (with `Portable` being `false` in the return values of [DescribeDisks](https://www.tencentcloud.com/document/api/362/16315?from_cn_redirect=1)) can be expanded. the unit of data disk capacity is GiB. the minimum expansion step is 10 GiB. for data disk type selection, refer to [disk product introduction](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1). the available data disk type is restricted by the instance type `InstanceType`. additionally, the maximum allowable capacity for expansion varies by data disk type.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Specifies the configuration information of the data disk to be expanded, only supporting specifying the target capacity of the disk to be expanded. only non-elastic data disks (with `Portable` being `false` in the return values of [DescribeDisks](https://www.tencentcloud.com/document/api/362/16315?from_cn_redirect=1)) can be expanded. the unit of data disk capacity is GiB. the minimum expansion step is 10 GiB. for data disk type selection, refer to [disk product introduction](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1). the available data disk type is restricted by the instance type `InstanceType`. additionally, the maximum allowable capacity for expansion varies by data disk type.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert>
     * @param DataDisks Specifies the configuration information of the data disk to be expanded, only supporting specifying the target capacity of the disk to be expanded. only non-elastic data disks (with `Portable` being `false` in the return values of [DescribeDisks](https://www.tencentcloud.com/document/api/362/16315?from_cn_redirect=1)) can be expanded. the unit of data disk capacity is GiB. the minimum expansion step is 10 GiB. for data disk type selection, refer to [disk product introduction](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1). the available data disk type is restricted by the instance type `InstanceType`. additionally, the maximum allowable capacity for expansion varies by data disk type.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Specifies whether to forcibly shut down a running instance. it is recommended to manually shut down a running instance first and then expand the instance disk. valid values:<br><li>true: forcibly shut down an instance after a normal shutdown fails.</li><br><li>false: do not forcibly shut down an instance after a normal shutdown fails.</li><br><br>default value: false.<br><br>forced shutdown is equivalent to turning off a physical computer's power switch. forced shutdown may cause data loss or file system corruption and should only be used when a server cannot be shut down normally. 
     * @return ForceStop Specifies whether to forcibly shut down a running instance. it is recommended to manually shut down a running instance first and then expand the instance disk. valid values:<br><li>true: forcibly shut down an instance after a normal shutdown fails.</li><br><li>false: do not forcibly shut down an instance after a normal shutdown fails.</li><br><br>default value: false.<br><br>forced shutdown is equivalent to turning off a physical computer's power switch. forced shutdown may cause data loss or file system corruption and should only be used when a server cannot be shut down normally.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set Specifies whether to forcibly shut down a running instance. it is recommended to manually shut down a running instance first and then expand the instance disk. valid values:<br><li>true: forcibly shut down an instance after a normal shutdown fails.</li><br><li>false: do not forcibly shut down an instance after a normal shutdown fails.</li><br><br>default value: false.<br><br>forced shutdown is equivalent to turning off a physical computer's power switch. forced shutdown may cause data loss or file system corruption and should only be used when a server cannot be shut down normally.
     * @param ForceStop Specifies whether to forcibly shut down a running instance. it is recommended to manually shut down a running instance first and then expand the instance disk. valid values:<br><li>true: forcibly shut down an instance after a normal shutdown fails.</li><br><li>false: do not forcibly shut down an instance after a normal shutdown fails.</li><br><br>default value: false.<br><br>forced shutdown is equivalent to turning off a physical computer's power switch. forced shutdown may cause data loss or file system corruption and should only be used when a server cannot be shut down normally.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get System disk configuration information to be expanded. only supports specifying the purpose capacity of the disk to be expanded. only supports cloud disk expansion.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert> 
     * @return SystemDisk System disk configuration information to be expanded. only supports specifying the purpose capacity of the disk to be expanded. only supports cloud disk expansion.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk configuration information to be expanded. only supports specifying the purpose capacity of the disk to be expanded. only supports cloud disk expansion.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert>
     * @param SystemDisk System disk configuration information to be expanded. only supports specifying the purpose capacity of the disk to be expanded. only supports cloud disk expansion.
<dx-alert infotype="explain" title="">You should specify either DataDisks or SystemDisk, but you cannot specify both at the same time.</dx-alert>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Whether the cloud disk is expanded online. 
     * @return ResizeOnline Whether the cloud disk is expanded online.
     */
    public Boolean getResizeOnline() {
        return this.ResizeOnline;
    }

    /**
     * Set Whether the cloud disk is expanded online.
     * @param ResizeOnline Whether the cloud disk is expanded online.
     */
    public void setResizeOnline(Boolean ResizeOnline) {
        this.ResizeOnline = ResizeOnline;
    }

    public ResizeInstanceDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResizeInstanceDisksRequest(ResizeInstanceDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.ResizeOnline != null) {
            this.ResizeOnline = new Boolean(source.ResizeOnline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamSimple(map, prefix + "ResizeOnline", this.ResizeOnline);

    }
}

