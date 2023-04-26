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

public class Groups extends AbstractModel{

    /**
    * User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Region ID
- `1`: Guangzhou 
- `4`: Shanghai 
- `5`: Hong Kong (China) 
- `6`: Toronto 
- `7`: Shanghai Finance 
- `8`: Beijing 
- `9`: Singapore
- `11`: Shenzhen Finance
- `15`: Silicon Valley (West US)
- `16`: Chengdu 
- `17`: Germany 
- `18`: South Korea 
- `19`: Chongqing 
- `21`: India 
- `22`: Virginia (East US)
- `23`: Thailand 
- `24`: Russia 
- `25`: Japan
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Replication group ID in the format of "crs-rpl-deind****"
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Replication group name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Status of replication group
- `37`: Associating replication group
- `38`: Reconnecting to replication group
- `51`: Disassociating replication group
- `52`: Switching with master instance in replication group
- `53`: Modifying the roles
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of replication groups
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Instance information in replication groups
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Instances")
    @Expose
    private Instances [] Instances;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID. 
     * @return AppId User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID.
     * @param AppId User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Region ID
- `1`: Guangzhou 
- `4`: Shanghai 
- `5`: Hong Kong (China) 
- `6`: Toronto 
- `7`: Shanghai Finance 
- `8`: Beijing 
- `9`: Singapore
- `11`: Shenzhen Finance
- `15`: Silicon Valley (West US)
- `16`: Chengdu 
- `17`: Germany 
- `18`: South Korea 
- `19`: Chongqing 
- `21`: India 
- `22`: Virginia (East US)
- `23`: Thailand 
- `24`: Russia 
- `25`: Japan 
     * @return RegionId Region ID
- `1`: Guangzhou 
- `4`: Shanghai 
- `5`: Hong Kong (China) 
- `6`: Toronto 
- `7`: Shanghai Finance 
- `8`: Beijing 
- `9`: Singapore
- `11`: Shenzhen Finance
- `15`: Silicon Valley (West US)
- `16`: Chengdu 
- `17`: Germany 
- `18`: South Korea 
- `19`: Chongqing 
- `21`: India 
- `22`: Virginia (East US)
- `23`: Thailand 
- `24`: Russia 
- `25`: Japan
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
- `1`: Guangzhou 
- `4`: Shanghai 
- `5`: Hong Kong (China) 
- `6`: Toronto 
- `7`: Shanghai Finance 
- `8`: Beijing 
- `9`: Singapore
- `11`: Shenzhen Finance
- `15`: Silicon Valley (West US)
- `16`: Chengdu 
- `17`: Germany 
- `18`: South Korea 
- `19`: Chongqing 
- `21`: India 
- `22`: Virginia (East US)
- `23`: Thailand 
- `24`: Russia 
- `25`: Japan
     * @param RegionId Region ID
- `1`: Guangzhou 
- `4`: Shanghai 
- `5`: Hong Kong (China) 
- `6`: Toronto 
- `7`: Shanghai Finance 
- `8`: Beijing 
- `9`: Singapore
- `11`: Shenzhen Finance
- `15`: Silicon Valley (West US)
- `16`: Chengdu 
- `17`: Germany 
- `18`: South Korea 
- `19`: Chongqing 
- `21`: India 
- `22`: Virginia (East US)
- `23`: Thailand 
- `24`: Russia 
- `25`: Japan
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Replication group ID in the format of "crs-rpl-deind****" 
     * @return GroupId Replication group ID in the format of "crs-rpl-deind****"
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Replication group ID in the format of "crs-rpl-deind****"
     * @param GroupId Replication group ID in the format of "crs-rpl-deind****"
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Replication group name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName Replication group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Replication group name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName Replication group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Status of replication group
- `37`: Associating replication group
- `38`: Reconnecting to replication group
- `51`: Disassociating replication group
- `52`: Switching with master instance in replication group
- `53`: Modifying the roles 
     * @return Status Status of replication group
- `37`: Associating replication group
- `38`: Reconnecting to replication group
- `51`: Disassociating replication group
- `52`: Switching with master instance in replication group
- `53`: Modifying the roles
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status of replication group
- `37`: Associating replication group
- `38`: Reconnecting to replication group
- `51`: Disassociating replication group
- `52`: Switching with master instance in replication group
- `53`: Modifying the roles
     * @param Status Status of replication group
- `37`: Associating replication group
- `38`: Reconnecting to replication group
- `51`: Disassociating replication group
- `52`: Switching with master instance in replication group
- `53`: Modifying the roles
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of replication groups 
     * @return InstanceCount Number of replication groups
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of replication groups
     * @param InstanceCount Number of replication groups
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Instance information in replication groups
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Instances Instance information in replication groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Instances [] getInstances() {
        return this.Instances;
    }

    /**
     * Set Instance information in replication groups
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Instances Instance information in replication groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstances(Instances [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public Groups() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Groups(Groups source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Instances != null) {
            this.Instances = new Instances[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new Instances(source.Instances[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

