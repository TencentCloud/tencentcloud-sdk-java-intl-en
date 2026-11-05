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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppStatisticsOverviewRequest extends AbstractModel {

    /**
    * <p>Application type. Available values: APP_TYPE_RAG (RAG), APP_TYPE_WORKFLOW (Workflow), APP_TYPE_CLAW (Claw), APP_TYPE_MULTIAGENT (MultiAgent). In the current period, only APP_TYPE_RAG takes effect. The rest are reserved values. Importing them will return InvalidParameter.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not import in requests)</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG (uniquely supported in the current period)</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent (reserved, not currently supported)</td></tr></tbody></table>
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
    * <p>Query time range (Unix seconds)</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private TimeRange TimeRange;

    /**
    * <p>View scope: application view (VIEW_TYPE_APP). For scope_id, enter the app ID (decimal string of the uint64 snowflake ID)</p>
    */
    @SerializedName("ViewScope")
    @Expose
    private ViewScope ViewScope;

    /**
    * <p>Space ID</p><p>Parameter format: <p>Space ID</p></p><p>Default value: default_space</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Application ID</p><p>Parameter format:</p><p>Application ID</p><p></p><p>Reference value: 2099767969573745984</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Extended filtering. Filter combination rule: multiple items use AND, and value_list under the same item uses OR. Supported Name: space_id (Space ID), channel_type (calling method/channel type; for values, see the trpc.adp.common.v2.ChannelType Enumeration Name). If channel_type is not specified, aggregation is performed by all channels.</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
     * Get <p>Application type. Available values: APP_TYPE_RAG (RAG), APP_TYPE_WORKFLOW (Workflow), APP_TYPE_CLAW (Claw), APP_TYPE_MULTIAGENT (MultiAgent). In the current period, only APP_TYPE_RAG takes effect. The rest are reserved values. Importing them will return InvalidParameter.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not import in requests)</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG (uniquely supported in the current period)</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent (reserved, not currently supported)</td></tr></tbody></table> 
     * @return AppType <p>Application type. Available values: APP_TYPE_RAG (RAG), APP_TYPE_WORKFLOW (Workflow), APP_TYPE_CLAW (Claw), APP_TYPE_MULTIAGENT (MultiAgent). In the current period, only APP_TYPE_RAG takes effect. The rest are reserved values. Importing them will return InvalidParameter.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not import in requests)</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG (uniquely supported in the current period)</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent (reserved, not currently supported)</td></tr></tbody></table>
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set <p>Application type. Available values: APP_TYPE_RAG (RAG), APP_TYPE_WORKFLOW (Workflow), APP_TYPE_CLAW (Claw), APP_TYPE_MULTIAGENT (MultiAgent). In the current period, only APP_TYPE_RAG takes effect. The rest are reserved values. Importing them will return InvalidParameter.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not import in requests)</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG (uniquely supported in the current period)</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent (reserved, not currently supported)</td></tr></tbody></table>
     * @param AppType <p>Application type. Available values: APP_TYPE_RAG (RAG), APP_TYPE_WORKFLOW (Workflow), APP_TYPE_CLAW (Claw), APP_TYPE_MULTIAGENT (MultiAgent). In the current period, only APP_TYPE_RAG takes effect. The rest are reserved values. Importing them will return InvalidParameter.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not import in requests)</td></tr><tr><td>APP_TYPE_RAG</td><td>1</td><td>RAG (uniquely supported in the current period)</td></tr><tr><td>APP_TYPE_WORKFLOW</td><td>2</td><td>Workflow (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_CLAW</td><td>3</td><td>Claw (reserved, not currently supported)</td></tr><tr><td>APP_TYPE_MULTIAGENT</td><td>4</td><td>MultiAgent (reserved, not currently supported)</td></tr></tbody></table>
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    /**
     * Get <p>Query time range (Unix seconds)</p> 
     * @return TimeRange <p>Query time range (Unix seconds)</p>
     */
    public TimeRange getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>Query time range (Unix seconds)</p>
     * @param TimeRange <p>Query time range (Unix seconds)</p>
     */
    public void setTimeRange(TimeRange TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get <p>View scope: application view (VIEW_TYPE_APP). For scope_id, enter the app ID (decimal string of the uint64 snowflake ID)</p> 
     * @return ViewScope <p>View scope: application view (VIEW_TYPE_APP). For scope_id, enter the app ID (decimal string of the uint64 snowflake ID)</p>
     */
    public ViewScope getViewScope() {
        return this.ViewScope;
    }

    /**
     * Set <p>View scope: application view (VIEW_TYPE_APP). For scope_id, enter the app ID (decimal string of the uint64 snowflake ID)</p>
     * @param ViewScope <p>View scope: application view (VIEW_TYPE_APP). For scope_id, enter the app ID (decimal string of the uint64 snowflake ID)</p>
     */
    public void setViewScope(ViewScope ViewScope) {
        this.ViewScope = ViewScope;
    }

    /**
     * Get <p>Space ID</p><p>Parameter format: <p>Space ID</p></p><p>Default value: default_space</p> 
     * @return SpaceId <p>Space ID</p><p>Parameter format: <p>Space ID</p></p><p>Default value: default_space</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space ID</p><p>Parameter format: <p>Space ID</p></p><p>Default value: default_space</p>
     * @param SpaceId <p>Space ID</p><p>Parameter format: <p>Space ID</p></p><p>Default value: default_space</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Application ID</p><p>Parameter format:</p><p>Application ID</p><p></p><p>Reference value: 2099767969573745984</p> 
     * @return AppId <p>Application ID</p><p>Parameter format:</p><p>Application ID</p><p></p><p>Reference value: 2099767969573745984</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID</p><p>Parameter format:</p><p>Application ID</p><p></p><p>Reference value: 2099767969573745984</p>
     * @param AppId <p>Application ID</p><p>Parameter format:</p><p>Application ID</p><p></p><p>Reference value: 2099767969573745984</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Extended filtering. Filter combination rule: multiple items use AND, and value_list under the same item uses OR. Supported Name: space_id (Space ID), channel_type (calling method/channel type; for values, see the trpc.adp.common.v2.ChannelType Enumeration Name). If channel_type is not specified, aggregation is performed by all channels.</p> 
     * @return FilterList <p>Extended filtering. Filter combination rule: multiple items use AND, and value_list under the same item uses OR. Supported Name: space_id (Space ID), channel_type (calling method/channel type; for values, see the trpc.adp.common.v2.ChannelType Enumeration Name). If channel_type is not specified, aggregation is performed by all channels.</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Extended filtering. Filter combination rule: multiple items use AND, and value_list under the same item uses OR. Supported Name: space_id (Space ID), channel_type (calling method/channel type; for values, see the trpc.adp.common.v2.ChannelType Enumeration Name). If channel_type is not specified, aggregation is performed by all channels.</p>
     * @param FilterList <p>Extended filtering. Filter combination rule: multiple items use AND, and value_list under the same item uses OR. Supported Name: space_id (Space ID), channel_type (calling method/channel type; for values, see the trpc.adp.common.v2.ChannelType Enumeration Name). If channel_type is not specified, aggregation is performed by all channels.</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    public DescribeAppStatisticsOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppStatisticsOverviewRequest(DescribeAppStatisticsOverviewRequest source) {
        if (source.AppType != null) {
            this.AppType = new Long(source.AppType);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new TimeRange(source.TimeRange);
        }
        if (source.ViewScope != null) {
            this.ViewScope = new ViewScope(source.ViewScope);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamObj(map, prefix + "TimeRange.", this.TimeRange);
        this.setParamObj(map, prefix + "ViewScope.", this.ViewScope);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);

    }
}

