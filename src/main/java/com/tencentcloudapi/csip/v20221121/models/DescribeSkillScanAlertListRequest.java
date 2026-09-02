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

public class DescribeSkillScanAlertListRequest extends AbstractModel {

    /**
    * Pagination offset.
Valid values: [0, +∞)
Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page
Valid values: [1, 200]
Default value: 10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria list. Supported filter fields: BelongAssetType (asset type ownership: HOST/CONTAINER, defaults to HOST if not specified), ContainerId (container ID, takes effect only for container alarms), RiskLevel (risk level, exact match), Status (processing status, exact match), SkillName (Skill name, fuzzy matching), UUID (host UUID, exact match), Level (alarm level, exact match), ContentHash (file SHA256, exact match), InstanceID (instance ID, exact match), InstanceName (instance name, fuzzy matching), SkillPath (Skill path, fuzzy matching)
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting method.
Enumeration values:
ASC: Ascending
DESC: descending order
Default value: DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field.
Enumeration values:
CreateTime: first detection time
SecurityScore: Security score
UpdateTime: Update time
Default value: CreateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Group account member id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get Pagination offset.
Valid values: [0, +∞)
Default value: 0 
     * @return Offset Pagination offset.
Valid values: [0, +∞)
Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
Valid values: [0, +∞)
Default value: 0
     * @param Offset Pagination offset.
Valid values: [0, +∞)
Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results per page
Valid values: [1, 200]
Default value: 10 
     * @return Limit Number of results per page
Valid values: [1, 200]
Default value: 10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page
Valid values: [1, 200]
Default value: 10
     * @param Limit Number of results per page
Valid values: [1, 200]
Default value: 10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria list. Supported filter fields: BelongAssetType (asset type ownership: HOST/CONTAINER, defaults to HOST if not specified), ContainerId (container ID, takes effect only for container alarms), RiskLevel (risk level, exact match), Status (processing status, exact match), SkillName (Skill name, fuzzy matching), UUID (host UUID, exact match), Level (alarm level, exact match), ContentHash (file SHA256, exact match), InstanceID (instance ID, exact match), InstanceName (instance name, fuzzy matching), SkillPath (Skill path, fuzzy matching) 
     * @return Filters Filter criteria list. Supported filter fields: BelongAssetType (asset type ownership: HOST/CONTAINER, defaults to HOST if not specified), ContainerId (container ID, takes effect only for container alarms), RiskLevel (risk level, exact match), Status (processing status, exact match), SkillName (Skill name, fuzzy matching), UUID (host UUID, exact match), Level (alarm level, exact match), ContentHash (file SHA256, exact match), InstanceID (instance ID, exact match), InstanceName (instance name, fuzzy matching), SkillPath (Skill path, fuzzy matching)
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria list. Supported filter fields: BelongAssetType (asset type ownership: HOST/CONTAINER, defaults to HOST if not specified), ContainerId (container ID, takes effect only for container alarms), RiskLevel (risk level, exact match), Status (processing status, exact match), SkillName (Skill name, fuzzy matching), UUID (host UUID, exact match), Level (alarm level, exact match), ContentHash (file SHA256, exact match), InstanceID (instance ID, exact match), InstanceName (instance name, fuzzy matching), SkillPath (Skill path, fuzzy matching)
     * @param Filters Filter criteria list. Supported filter fields: BelongAssetType (asset type ownership: HOST/CONTAINER, defaults to HOST if not specified), ContainerId (container ID, takes effect only for container alarms), RiskLevel (risk level, exact match), Status (processing status, exact match), SkillName (Skill name, fuzzy matching), UUID (host UUID, exact match), Level (alarm level, exact match), ContentHash (file SHA256, exact match), InstanceID (instance ID, exact match), InstanceName (instance name, fuzzy matching), SkillPath (Skill path, fuzzy matching)
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method.
Enumeration values:
ASC: Ascending
DESC: descending order
Default value: DESC 
     * @return Order Sorting method.
Enumeration values:
ASC: Ascending
DESC: descending order
Default value: DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method.
Enumeration values:
ASC: Ascending
DESC: descending order
Default value: DESC
     * @param Order Sorting method.
Enumeration values:
ASC: Ascending
DESC: descending order
Default value: DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field.
Enumeration values:
CreateTime: first detection time
SecurityScore: Security score
UpdateTime: Update time
Default value: CreateTime 
     * @return By Sorting field.
Enumeration values:
CreateTime: first detection time
SecurityScore: Security score
UpdateTime: Update time
Default value: CreateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field.
Enumeration values:
CreateTime: first detection time
SecurityScore: Security score
UpdateTime: Update time
Default value: CreateTime
     * @param By Sorting field.
Enumeration values:
CreateTime: first detection time
SecurityScore: Security score
UpdateTime: Update time
Default value: CreateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Group account member id 
     * @return MemberId Group account member id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group account member id
     * @param MemberId Group account member id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeSkillScanAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanAlertListRequest(DescribeSkillScanAlertListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

