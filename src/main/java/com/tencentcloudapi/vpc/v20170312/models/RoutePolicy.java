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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoutePolicy extends AbstractModel {

    /**
    * Unique ID of the routing policy.

Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RoutePolicyId")
    @Expose
    private String RoutePolicyId;

    /**
    * Specifies the routing strategy name.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RoutePolicyName")
    @Expose
    private String RoutePolicyName;

    /**
    * Routing policy description.

Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RoutePolicyDescription")
    @Expose
    private String RoutePolicyDescription;

    /**
    * Routing policy rule list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RoutePolicyEntrySet")
    @Expose
    private RoutePolicyEntry [] RoutePolicyEntrySet;

    /**
    * Specifies the routing strategy binding.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RoutePolicyAssociationSet")
    @Expose
    private RoutePolicyAssociation [] RoutePolicyAssociationSet;

    /**
    * Creation time.

Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Tag key-value pair.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get Unique ID of the routing policy.

Note: This field may return null, indicating that no valid value was found. 
     * @return RoutePolicyId Unique ID of the routing policy.

Note: This field may return null, indicating that no valid value was found.
     */
    public String getRoutePolicyId() {
        return this.RoutePolicyId;
    }

    /**
     * Set Unique ID of the routing policy.

Note: This field may return null, indicating that no valid value was found.
     * @param RoutePolicyId Unique ID of the routing policy.

Note: This field may return null, indicating that no valid value was found.
     */
    public void setRoutePolicyId(String RoutePolicyId) {
        this.RoutePolicyId = RoutePolicyId;
    }

    /**
     * Get Specifies the routing strategy name.
Note: This field may return null, indicating that no valid value was found. 
     * @return RoutePolicyName Specifies the routing strategy name.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getRoutePolicyName() {
        return this.RoutePolicyName;
    }

    /**
     * Set Specifies the routing strategy name.
Note: This field may return null, indicating that no valid value was found.
     * @param RoutePolicyName Specifies the routing strategy name.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRoutePolicyName(String RoutePolicyName) {
        this.RoutePolicyName = RoutePolicyName;
    }

    /**
     * Get Routing policy description.

Note: This field may return null, indicating that no valid value was found. 
     * @return RoutePolicyDescription Routing policy description.

Note: This field may return null, indicating that no valid value was found.
     */
    public String getRoutePolicyDescription() {
        return this.RoutePolicyDescription;
    }

    /**
     * Set Routing policy description.

Note: This field may return null, indicating that no valid value was found.
     * @param RoutePolicyDescription Routing policy description.

Note: This field may return null, indicating that no valid value was found.
     */
    public void setRoutePolicyDescription(String RoutePolicyDescription) {
        this.RoutePolicyDescription = RoutePolicyDescription;
    }

    /**
     * Get Routing policy rule list.
Note: This field may return null, indicating that no valid value was found. 
     * @return RoutePolicyEntrySet Routing policy rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public RoutePolicyEntry [] getRoutePolicyEntrySet() {
        return this.RoutePolicyEntrySet;
    }

    /**
     * Set Routing policy rule list.
Note: This field may return null, indicating that no valid value was found.
     * @param RoutePolicyEntrySet Routing policy rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRoutePolicyEntrySet(RoutePolicyEntry [] RoutePolicyEntrySet) {
        this.RoutePolicyEntrySet = RoutePolicyEntrySet;
    }

    /**
     * Get Specifies the routing strategy binding.
Note: This field may return null, indicating that no valid value was found. 
     * @return RoutePolicyAssociationSet Specifies the routing strategy binding.
Note: This field may return null, indicating that no valid value was found.
     */
    public RoutePolicyAssociation [] getRoutePolicyAssociationSet() {
        return this.RoutePolicyAssociationSet;
    }

    /**
     * Set Specifies the routing strategy binding.
Note: This field may return null, indicating that no valid value was found.
     * @param RoutePolicyAssociationSet Specifies the routing strategy binding.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRoutePolicyAssociationSet(RoutePolicyAssociation [] RoutePolicyAssociationSet) {
        this.RoutePolicyAssociationSet = RoutePolicyAssociationSet;
    }

    /**
     * Get Creation time.

Note: This field may return null, indicating that no valid value was found. 
     * @return CreatedTime Creation time.

Note: This field may return null, indicating that no valid value was found.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.

Note: This field may return null, indicating that no valid value was found.
     * @param CreatedTime Creation time.

Note: This field may return null, indicating that no valid value was found.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Tag key-value pair. 
     * @return TagSet Tag key-value pair.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pair.
     * @param TagSet Tag key-value pair.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public RoutePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoutePolicy(RoutePolicy source) {
        if (source.RoutePolicyId != null) {
            this.RoutePolicyId = new String(source.RoutePolicyId);
        }
        if (source.RoutePolicyName != null) {
            this.RoutePolicyName = new String(source.RoutePolicyName);
        }
        if (source.RoutePolicyDescription != null) {
            this.RoutePolicyDescription = new String(source.RoutePolicyDescription);
        }
        if (source.RoutePolicyEntrySet != null) {
            this.RoutePolicyEntrySet = new RoutePolicyEntry[source.RoutePolicyEntrySet.length];
            for (int i = 0; i < source.RoutePolicyEntrySet.length; i++) {
                this.RoutePolicyEntrySet[i] = new RoutePolicyEntry(source.RoutePolicyEntrySet[i]);
            }
        }
        if (source.RoutePolicyAssociationSet != null) {
            this.RoutePolicyAssociationSet = new RoutePolicyAssociation[source.RoutePolicyAssociationSet.length];
            for (int i = 0; i < source.RoutePolicyAssociationSet.length; i++) {
                this.RoutePolicyAssociationSet[i] = new RoutePolicyAssociation(source.RoutePolicyAssociationSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutePolicyId", this.RoutePolicyId);
        this.setParamSimple(map, prefix + "RoutePolicyName", this.RoutePolicyName);
        this.setParamSimple(map, prefix + "RoutePolicyDescription", this.RoutePolicyDescription);
        this.setParamArrayObj(map, prefix + "RoutePolicyEntrySet.", this.RoutePolicyEntrySet);
        this.setParamArrayObj(map, prefix + "RoutePolicyAssociationSet.", this.RoutePolicyAssociationSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

