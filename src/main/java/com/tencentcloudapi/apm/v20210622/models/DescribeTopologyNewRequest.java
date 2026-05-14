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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopologyNewRequest extends AbstractModel {

    /**
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Querying start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Application name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Upstream level.
    */
    @SerializedName("UpLevel")
    @Expose
    private Long UpLevel;

    /**
    * Application instance information.
    */
    @SerializedName("ServiceInstance")
    @Expose
    private String ServiceInstance;

    /**
    * downstream hierarchy
    */
    @SerializedName("DownLevel")
    @Expose
    private Long DownLevel;

    /**
    * perspective
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * Filter.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Represents topic (for MQ topology)
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * View filtering list.
    */
    @SerializedName("Selectors")
    @Expose
    private Selectors Selectors;

    /**
    * View ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * TraceID
    */
    @SerializedName("TraceID")
    @Expose
    private String TraceID;

    /**
    * Specifies the top 5 slow response nodes query.
    */
    @SerializedName("IsSlowTopFive")
    @Expose
    private Boolean IsSlowTopFive;

    /**
    * Whether the resource layer information is obtained.
    */
    @SerializedName("GetResource")
    @Expose
    private Boolean GetResource;

    /**
    * Filters by application tag.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Node type not displayed.
    */
    @SerializedName("Hidden")
    @Expose
    private Selectors Hidden;

    /**
     * Get Business system ID 
     * @return InstanceId Business system ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system ID
     * @param InstanceId Business system ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Querying start time. 
     * @return StartTime Querying start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Querying start time.
     * @param StartTime Querying start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time 
     * @return EndTime Query end time
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time
     * @param EndTime Query end time
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Application name 
     * @return ServiceName Application name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application name
     * @param ServiceName Application name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Upstream level. 
     * @return UpLevel Upstream level.
     */
    public Long getUpLevel() {
        return this.UpLevel;
    }

    /**
     * Set Upstream level.
     * @param UpLevel Upstream level.
     */
    public void setUpLevel(Long UpLevel) {
        this.UpLevel = UpLevel;
    }

    /**
     * Get Application instance information. 
     * @return ServiceInstance Application instance information.
     */
    public String getServiceInstance() {
        return this.ServiceInstance;
    }

    /**
     * Set Application instance information.
     * @param ServiceInstance Application instance information.
     */
    public void setServiceInstance(String ServiceInstance) {
        this.ServiceInstance = ServiceInstance;
    }

    /**
     * Get downstream hierarchy 
     * @return DownLevel downstream hierarchy
     */
    public Long getDownLevel() {
        return this.DownLevel;
    }

    /**
     * Set downstream hierarchy
     * @param DownLevel downstream hierarchy
     */
    public void setDownLevel(Long DownLevel) {
        this.DownLevel = DownLevel;
    }

    /**
     * Get perspective 
     * @return View perspective
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set perspective
     * @param View perspective
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get Filter. 
     * @return Filters Filter.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
     * @param Filters Filter.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Represents topic (for MQ topology) 
     * @return Topic Represents topic (for MQ topology)
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Represents topic (for MQ topology)
     * @param Topic Represents topic (for MQ topology)
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get View filtering list. 
     * @return Selectors View filtering list.
     */
    public Selectors getSelectors() {
        return this.Selectors;
    }

    /**
     * Set View filtering list.
     * @param Selectors View filtering list.
     */
    public void setSelectors(Selectors Selectors) {
        this.Selectors = Selectors;
    }

    /**
     * Get View ID 
     * @return Id View ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set View ID
     * @param Id View ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get TraceID 
     * @return TraceID TraceID
     */
    public String getTraceID() {
        return this.TraceID;
    }

    /**
     * Set TraceID
     * @param TraceID TraceID
     */
    public void setTraceID(String TraceID) {
        this.TraceID = TraceID;
    }

    /**
     * Get Specifies the top 5 slow response nodes query. 
     * @return IsSlowTopFive Specifies the top 5 slow response nodes query.
     */
    public Boolean getIsSlowTopFive() {
        return this.IsSlowTopFive;
    }

    /**
     * Set Specifies the top 5 slow response nodes query.
     * @param IsSlowTopFive Specifies the top 5 slow response nodes query.
     */
    public void setIsSlowTopFive(Boolean IsSlowTopFive) {
        this.IsSlowTopFive = IsSlowTopFive;
    }

    /**
     * Get Whether the resource layer information is obtained. 
     * @return GetResource Whether the resource layer information is obtained.
     */
    public Boolean getGetResource() {
        return this.GetResource;
    }

    /**
     * Set Whether the resource layer information is obtained.
     * @param GetResource Whether the resource layer information is obtained.
     */
    public void setGetResource(Boolean GetResource) {
        this.GetResource = GetResource;
    }

    /**
     * Get Filters by application tag. 
     * @return Tags Filters by application tag.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Filters by application tag.
     * @param Tags Filters by application tag.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Node type not displayed. 
     * @return Hidden Node type not displayed.
     */
    public Selectors getHidden() {
        return this.Hidden;
    }

    /**
     * Set Node type not displayed.
     * @param Hidden Node type not displayed.
     */
    public void setHidden(Selectors Hidden) {
        this.Hidden = Hidden;
    }

    public DescribeTopologyNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopologyNewRequest(DescribeTopologyNewRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.UpLevel != null) {
            this.UpLevel = new Long(source.UpLevel);
        }
        if (source.ServiceInstance != null) {
            this.ServiceInstance = new String(source.ServiceInstance);
        }
        if (source.DownLevel != null) {
            this.DownLevel = new Long(source.DownLevel);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Selectors != null) {
            this.Selectors = new Selectors(source.Selectors);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TraceID != null) {
            this.TraceID = new String(source.TraceID);
        }
        if (source.IsSlowTopFive != null) {
            this.IsSlowTopFive = new Boolean(source.IsSlowTopFive);
        }
        if (source.GetResource != null) {
            this.GetResource = new Boolean(source.GetResource);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.Hidden != null) {
            this.Hidden = new Selectors(source.Hidden);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "UpLevel", this.UpLevel);
        this.setParamSimple(map, prefix + "ServiceInstance", this.ServiceInstance);
        this.setParamSimple(map, prefix + "DownLevel", this.DownLevel);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamObj(map, prefix + "Selectors.", this.Selectors);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TraceID", this.TraceID);
        this.setParamSimple(map, prefix + "IsSlowTopFive", this.IsSlowTopFive);
        this.setParamSimple(map, prefix + "GetResource", this.GetResource);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Hidden.", this.Hidden);

    }
}

