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

public class DescribeCWPMachinesRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>1. Primary table field filtering (requires specifying OperatorType)<br>MachineName: host name, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["test-server"]<br>MachineIp: private IP address, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["10.0.0.1"]<br>MachineWanIp: public network IP, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["1.2.3.4"]<br>InstanceID: instance ID, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["ins-xxxxx"]<br>MachineStatus / InstanceStatus: instance status, supports OperatorType 7 (IN), 1 (equal), Values example: ["RUNNING"], available Values: RUNNING/STOPPED/EXPIRED<br>MachineOs: operating system type, supports OperatorType 7 (IN), Values example: ["1"], the value is a numeric code, see OsType description below<br>VpcId: VPC ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["VPC-xxxxx"]<br>CloudFromEnum: cloud service provider, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"], the value is a numeric code, see CloudFrom description below<br>Region: Region, supports OperatorType 7 (IN), 1 (equal), Values example: ["ap-guangzhou"]<br>AppId: account AppId, supports OperatorType 7 (IN), 1 (equal), Values example: ["1234567890"]<br>ProjectId: project ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"]</p><p>2. Pre-filter fields (no OperatorType required)<br>AgentStatus: Agent status, single selection, Values example: ["ONLINE"], available Values: ONLINE/OFFLINE/UNINSTALL<br>ProtectType: protection type (comprehensive), Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType: CSIP protection type, Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CloudTags: cloud tag, Values example: ["tagKey$tagValue"], format: tagKey$tagValue or tagKey (matches key only), up to 5 Values<br>Tags: asset tag, Values example: ["123"], the value is a tag ID<br>ExposedStatus: exposure status, single selection, Values example: ["EXPOSED"], available Values: NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>3. Special filter fields (no OperatorType required)<br>NetworkType: network type, single selection, Values example: ["1"], 1=VPC network, 2=BASIC network, 3=Non-Tencent Cloud Network<br>MachineType: machine type, multiple selections allowed, Values example: ["CVM"], available Values: CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common: general search, single selection, Values example: ["keyword"], performs fuzzy matching on private IP address, public network IP, host name, and instance ID at the same time</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>Whether TAT status information is required</p>
    */
    @SerializedName("NeedTatStatus")
    @Expose
    private Boolean NeedTatStatus;

    /**
    * <p>Whether additional information is required, such as security center tags and Tencent Cloud tags</p>
    */
    @SerializedName("MoreInformation")
    @Expose
    private Boolean MoreInformation;

    /**
    * <p>Whether container information is required, such as number of containers, cores, and container protection status</p>
    */
    @SerializedName("NeedContainerInfo")
    @Expose
    private Boolean NeedContainerInfo;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>1. Primary table field filtering (requires specifying OperatorType)<br>MachineName: host name, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["test-server"]<br>MachineIp: private IP address, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["10.0.0.1"]<br>MachineWanIp: public network IP, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["1.2.3.4"]<br>InstanceID: instance ID, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["ins-xxxxx"]<br>MachineStatus / InstanceStatus: instance status, supports OperatorType 7 (IN), 1 (equal), Values example: ["RUNNING"], available Values: RUNNING/STOPPED/EXPIRED<br>MachineOs: operating system type, supports OperatorType 7 (IN), Values example: ["1"], the value is a numeric code, see OsType description below<br>VpcId: VPC ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["VPC-xxxxx"]<br>CloudFromEnum: cloud service provider, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"], the value is a numeric code, see CloudFrom description below<br>Region: Region, supports OperatorType 7 (IN), 1 (equal), Values example: ["ap-guangzhou"]<br>AppId: account AppId, supports OperatorType 7 (IN), 1 (equal), Values example: ["1234567890"]<br>ProjectId: project ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"]</p><p>2. Pre-filter fields (no OperatorType required)<br>AgentStatus: Agent status, single selection, Values example: ["ONLINE"], available Values: ONLINE/OFFLINE/UNINSTALL<br>ProtectType: protection type (comprehensive), Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType: CSIP protection type, Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CloudTags: cloud tag, Values example: ["tagKey$tagValue"], format: tagKey$tagValue or tagKey (matches key only), up to 5 Values<br>Tags: asset tag, Values example: ["123"], the value is a tag ID<br>ExposedStatus: exposure status, single selection, Values example: ["EXPOSED"], available Values: NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>3. Special filter fields (no OperatorType required)<br>NetworkType: network type, single selection, Values example: ["1"], 1=VPC network, 2=BASIC network, 3=Non-Tencent Cloud Network<br>MachineType: machine type, multiple selections allowed, Values example: ["CVM"], available Values: CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common: general search, single selection, Values example: ["keyword"], performs fuzzy matching on private IP address, public network IP, host name, and instance ID at the same time</p> 
     * @return Filter <p>1. Primary table field filtering (requires specifying OperatorType)<br>MachineName: host name, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["test-server"]<br>MachineIp: private IP address, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["10.0.0.1"]<br>MachineWanIp: public network IP, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["1.2.3.4"]<br>InstanceID: instance ID, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["ins-xxxxx"]<br>MachineStatus / InstanceStatus: instance status, supports OperatorType 7 (IN), 1 (equal), Values example: ["RUNNING"], available Values: RUNNING/STOPPED/EXPIRED<br>MachineOs: operating system type, supports OperatorType 7 (IN), Values example: ["1"], the value is a numeric code, see OsType description below<br>VpcId: VPC ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["VPC-xxxxx"]<br>CloudFromEnum: cloud service provider, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"], the value is a numeric code, see CloudFrom description below<br>Region: Region, supports OperatorType 7 (IN), 1 (equal), Values example: ["ap-guangzhou"]<br>AppId: account AppId, supports OperatorType 7 (IN), 1 (equal), Values example: ["1234567890"]<br>ProjectId: project ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"]</p><p>2. Pre-filter fields (no OperatorType required)<br>AgentStatus: Agent status, single selection, Values example: ["ONLINE"], available Values: ONLINE/OFFLINE/UNINSTALL<br>ProtectType: protection type (comprehensive), Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType: CSIP protection type, Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CloudTags: cloud tag, Values example: ["tagKey$tagValue"], format: tagKey$tagValue or tagKey (matches key only), up to 5 Values<br>Tags: asset tag, Values example: ["123"], the value is a tag ID<br>ExposedStatus: exposure status, single selection, Values example: ["EXPOSED"], available Values: NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>3. Special filter fields (no OperatorType required)<br>NetworkType: network type, single selection, Values example: ["1"], 1=VPC network, 2=BASIC network, 3=Non-Tencent Cloud Network<br>MachineType: machine type, multiple selections allowed, Values example: ["CVM"], available Values: CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common: general search, single selection, Values example: ["keyword"], performs fuzzy matching on private IP address, public network IP, host name, and instance ID at the same time</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>1. Primary table field filtering (requires specifying OperatorType)<br>MachineName: host name, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["test-server"]<br>MachineIp: private IP address, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["10.0.0.1"]<br>MachineWanIp: public network IP, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["1.2.3.4"]<br>InstanceID: instance ID, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["ins-xxxxx"]<br>MachineStatus / InstanceStatus: instance status, supports OperatorType 7 (IN), 1 (equal), Values example: ["RUNNING"], available Values: RUNNING/STOPPED/EXPIRED<br>MachineOs: operating system type, supports OperatorType 7 (IN), Values example: ["1"], the value is a numeric code, see OsType description below<br>VpcId: VPC ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["VPC-xxxxx"]<br>CloudFromEnum: cloud service provider, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"], the value is a numeric code, see CloudFrom description below<br>Region: Region, supports OperatorType 7 (IN), 1 (equal), Values example: ["ap-guangzhou"]<br>AppId: account AppId, supports OperatorType 7 (IN), 1 (equal), Values example: ["1234567890"]<br>ProjectId: project ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"]</p><p>2. Pre-filter fields (no OperatorType required)<br>AgentStatus: Agent status, single selection, Values example: ["ONLINE"], available Values: ONLINE/OFFLINE/UNINSTALL<br>ProtectType: protection type (comprehensive), Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType: CSIP protection type, Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CloudTags: cloud tag, Values example: ["tagKey$tagValue"], format: tagKey$tagValue or tagKey (matches key only), up to 5 Values<br>Tags: asset tag, Values example: ["123"], the value is a tag ID<br>ExposedStatus: exposure status, single selection, Values example: ["EXPOSED"], available Values: NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>3. Special filter fields (no OperatorType required)<br>NetworkType: network type, single selection, Values example: ["1"], 1=VPC network, 2=BASIC network, 3=Non-Tencent Cloud Network<br>MachineType: machine type, multiple selections allowed, Values example: ["CVM"], available Values: CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common: general search, single selection, Values example: ["keyword"], performs fuzzy matching on private IP address, public network IP, host name, and instance ID at the same time</p>
     * @param Filter <p>1. Primary table field filtering (requires specifying OperatorType)<br>MachineName: host name, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["test-server"]<br>MachineIp: private IP address, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["10.0.0.1"]<br>MachineWanIp: public network IP, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["1.2.3.4"]<br>InstanceID: instance ID, supports OperatorType 9 (fuzzy), 7 (IN), Values example: ["ins-xxxxx"]<br>MachineStatus / InstanceStatus: instance status, supports OperatorType 7 (IN), 1 (equal), Values example: ["RUNNING"], available Values: RUNNING/STOPPED/EXPIRED<br>MachineOs: operating system type, supports OperatorType 7 (IN), Values example: ["1"], the value is a numeric code, see OsType description below<br>VpcId: VPC ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["VPC-xxxxx"]<br>CloudFromEnum: cloud service provider, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"], the value is a numeric code, see CloudFrom description below<br>Region: Region, supports OperatorType 7 (IN), 1 (equal), Values example: ["ap-guangzhou"]<br>AppId: account AppId, supports OperatorType 7 (IN), 1 (equal), Values example: ["1234567890"]<br>ProjectId: project ID, supports OperatorType 7 (IN), 1 (equal), Values example: ["0"]</p><p>2. Pre-filter fields (no OperatorType required)<br>AgentStatus: Agent status, single selection, Values example: ["ONLINE"], available Values: ONLINE/OFFLINE/UNINSTALL<br>ProtectType: protection type (comprehensive), Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CsipProtectType: CSIP protection type, Values example: ["ULTIMATE"], available Values: BASIC/PRO/ULTIMATE/NONE<br>CloudTags: cloud tag, Values example: ["tagKey$tagValue"], format: tagKey$tagValue or tagKey (matches key only), up to 5 Values<br>Tags: asset tag, Values example: ["123"], the value is a tag ID<br>ExposedStatus: exposure status, single selection, Values example: ["EXPOSED"], available Values: NOT_APPLICABLE/EXPOSED/UNEXPOSED</p><p>3. Special filter fields (no OperatorType required)<br>NetworkType: network type, single selection, Values example: ["1"], 1=VPC network, 2=BASIC network, 3=Non-Tencent Cloud Network<br>MachineType: machine type, multiple selections allowed, Values example: ["CVM"], available Values: CVM/BM/ECM/LH/EKS-NATIVE/ECS/EC2/VMS<br>Common: general search, single selection, Values example: ["keyword"], performs fuzzy matching on private IP address, public network IP, host name, and instance ID at the same time</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>Whether TAT status information is required</p> 
     * @return NeedTatStatus <p>Whether TAT status information is required</p>
     */
    public Boolean getNeedTatStatus() {
        return this.NeedTatStatus;
    }

    /**
     * Set <p>Whether TAT status information is required</p>
     * @param NeedTatStatus <p>Whether TAT status information is required</p>
     */
    public void setNeedTatStatus(Boolean NeedTatStatus) {
        this.NeedTatStatus = NeedTatStatus;
    }

    /**
     * Get <p>Whether additional information is required, such as security center tags and Tencent Cloud tags</p> 
     * @return MoreInformation <p>Whether additional information is required, such as security center tags and Tencent Cloud tags</p>
     */
    public Boolean getMoreInformation() {
        return this.MoreInformation;
    }

    /**
     * Set <p>Whether additional information is required, such as security center tags and Tencent Cloud tags</p>
     * @param MoreInformation <p>Whether additional information is required, such as security center tags and Tencent Cloud tags</p>
     */
    public void setMoreInformation(Boolean MoreInformation) {
        this.MoreInformation = MoreInformation;
    }

    /**
     * Get <p>Whether container information is required, such as number of containers, cores, and container protection status</p> 
     * @return NeedContainerInfo <p>Whether container information is required, such as number of containers, cores, and container protection status</p>
     */
    public Boolean getNeedContainerInfo() {
        return this.NeedContainerInfo;
    }

    /**
     * Set <p>Whether container information is required, such as number of containers, cores, and container protection status</p>
     * @param NeedContainerInfo <p>Whether container information is required, such as number of containers, cores, and container protection status</p>
     */
    public void setNeedContainerInfo(Boolean NeedContainerInfo) {
        this.NeedContainerInfo = NeedContainerInfo;
    }

    public DescribeCWPMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCWPMachinesRequest(DescribeCWPMachinesRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.NeedTatStatus != null) {
            this.NeedTatStatus = new Boolean(source.NeedTatStatus);
        }
        if (source.MoreInformation != null) {
            this.MoreInformation = new Boolean(source.MoreInformation);
        }
        if (source.NeedContainerInfo != null) {
            this.NeedContainerInfo = new Boolean(source.NeedContainerInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "NeedTatStatus", this.NeedTatStatus);
        this.setParamSimple(map, prefix + "MoreInformation", this.MoreInformation);
        this.setParamSimple(map, prefix + "NeedContainerInfo", this.NeedContainerInfo);

    }
}

