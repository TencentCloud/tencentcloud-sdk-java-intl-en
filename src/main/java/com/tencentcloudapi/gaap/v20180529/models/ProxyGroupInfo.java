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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupInfo extends AbstractModel{

    /**
    * Connection group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Connection group name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Target region
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * Connection group status.
Where:
0: running;
1: creating;
4: terminating;
11: connection migrating.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Tag list.
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * Get Connection group ID 
     * @return GroupId Connection group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID
     * @param GroupId Connection group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Connection group name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName Connection group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Connection group name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName Connection group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Target region 
     * @return RealServerRegionInfo Target region
     */
    public RegionDetail getRealServerRegionInfo() {
        return this.RealServerRegionInfo;
    }

    /**
     * Set Target region
     * @param RealServerRegionInfo Target region
     */
    public void setRealServerRegionInfo(RegionDetail RealServerRegionInfo) {
        this.RealServerRegionInfo = RealServerRegionInfo;
    }

    /**
     * Get Connection group status.
Where:
0: running;
1: creating;
4: terminating;
11: connection migrating. 
     * @return Status Connection group status.
Where:
0: running;
1: creating;
4: terminating;
11: connection migrating.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Connection group status.
Where:
0: running;
1: creating;
4: terminating;
11: connection migrating.
     * @param Status Connection group status.
Where:
0: running;
1: creating;
4: terminating;
11: connection migrating.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Tag list. 
     * @return TagSet Tag list.
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list.
     * @param TagSet Tag list.
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

