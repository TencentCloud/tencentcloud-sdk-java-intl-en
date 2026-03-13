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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecyclePolicy extends AbstractModel {

    /**
    * <P>The time when the lifecycle management policy was created</p>.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Lifecycle management policy ID.</p>.
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
    * <P>Lifecycle management policy name</p>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LifecyclePolicyName")
    @Expose
    private String LifecyclePolicyName;

    /**
    * <P>List of management rules associated with the lifecycle management policy.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LifecycleRules")
    @Expose
    private LifecycleRule [] LifecycleRules;

    /**
    * <P>List of absolute paths for directories associated with the lifecycle management policy</p>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Paths")
    @Expose
    private PathInfo [] Paths;

    /**
     * Get <P>The time when the lifecycle management policy was created</p>. 
     * @return CreateTime <P>The time when the lifecycle management policy was created</p>.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <P>The time when the lifecycle management policy was created</p>.
     * @param CreateTime <P>The time when the lifecycle management policy was created</p>.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Lifecycle management policy ID.</p>. 
     * @return LifecyclePolicyID <p>Lifecycle management policy ID.</p>.
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set <p>Lifecycle management policy ID.</p>.
     * @param LifecyclePolicyID <p>Lifecycle management policy ID.</p>.
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    /**
     * Get <P>Lifecycle management policy name</p>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LifecyclePolicyName <P>Lifecycle management policy name</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLifecyclePolicyName() {
        return this.LifecyclePolicyName;
    }

    /**
     * Set <P>Lifecycle management policy name</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LifecyclePolicyName <P>Lifecycle management policy name</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifecyclePolicyName(String LifecyclePolicyName) {
        this.LifecyclePolicyName = LifecyclePolicyName;
    }

    /**
     * Get <P>List of management rules associated with the lifecycle management policy.</p>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LifecycleRules <P>List of management rules associated with the lifecycle management policy.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LifecycleRule [] getLifecycleRules() {
        return this.LifecycleRules;
    }

    /**
     * Set <P>List of management rules associated with the lifecycle management policy.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LifecycleRules <P>List of management rules associated with the lifecycle management policy.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifecycleRules(LifecycleRule [] LifecycleRules) {
        this.LifecycleRules = LifecycleRules;
    }

    /**
     * Get <P>List of absolute paths for directories associated with the lifecycle management policy</p>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Paths <P>List of absolute paths for directories associated with the lifecycle management policy</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PathInfo [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <P>List of absolute paths for directories associated with the lifecycle management policy</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Paths <P>List of absolute paths for directories associated with the lifecycle management policy</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPaths(PathInfo [] Paths) {
        this.Paths = Paths;
    }

    public LifecyclePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecyclePolicy(LifecyclePolicy source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
        if (source.LifecyclePolicyName != null) {
            this.LifecyclePolicyName = new String(source.LifecyclePolicyName);
        }
        if (source.LifecycleRules != null) {
            this.LifecycleRules = new LifecycleRule[source.LifecycleRules.length];
            for (int i = 0; i < source.LifecycleRules.length; i++) {
                this.LifecycleRules[i] = new LifecycleRule(source.LifecycleRules[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new PathInfo[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new PathInfo(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);
        this.setParamSimple(map, prefix + "LifecyclePolicyName", this.LifecyclePolicyName);
        this.setParamArrayObj(map, prefix + "LifecycleRules.", this.LifecycleRules);
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

