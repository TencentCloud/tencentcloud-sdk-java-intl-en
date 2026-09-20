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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoundPlaysRequest extends AbstractModel {

    /**
    * <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), they must fill in this field with the app ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Filter criteria: carousel playlist identifiers. The array can contain up to 100 identifiers.</p>
    */
    @SerializedName("RoundPlayIds")
    @Expose
    private String [] RoundPlayIds;

    /**
    * <p>Filter criteria, carousel playlist status. Available values: <li>Enabled: Running state;</li> <li>Disabled: Stopped.</li></p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Filter criteria: Carousel Playlist Creation Time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * <p>Filter criteria: carousel playlist update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private TimeRange UpdateTime;

    /**
    * <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p>
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * <p>Paging offset. Default value: 0. Deprecated. Perform batch query according to the ScrollToken parameter.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), they must fill in this field with the app ID.</b></p> 
     * @return SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), they must fill in this field with the app ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), they must fill in this field with the app ID.</b></p>
     * @param SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), they must fill in this field with the app ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Filter criteria: carousel playlist identifiers. The array can contain up to 100 identifiers.</p> 
     * @return RoundPlayIds <p>Filter criteria: carousel playlist identifiers. The array can contain up to 100 identifiers.</p>
     */
    public String [] getRoundPlayIds() {
        return this.RoundPlayIds;
    }

    /**
     * Set <p>Filter criteria: carousel playlist identifiers. The array can contain up to 100 identifiers.</p>
     * @param RoundPlayIds <p>Filter criteria: carousel playlist identifiers. The array can contain up to 100 identifiers.</p>
     */
    public void setRoundPlayIds(String [] RoundPlayIds) {
        this.RoundPlayIds = RoundPlayIds;
    }

    /**
     * Get <p>Filter criteria, carousel playlist status. Available values: <li>Enabled: Running state;</li> <li>Disabled: Stopped.</li></p> 
     * @return Status <p>Filter criteria, carousel playlist status. Available values: <li>Enabled: Running state;</li> <li>Disabled: Stopped.</li></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Filter criteria, carousel playlist status. Available values: <li>Enabled: Running state;</li> <li>Disabled: Stopped.</li></p>
     * @param Status <p>Filter criteria, carousel playlist status. Available values: <li>Enabled: Running state;</li> <li>Disabled: Stopped.</li></p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Filter criteria: Carousel Playlist Creation Time.</p> 
     * @return CreateTime <p>Filter criteria: Carousel Playlist Creation Time.</p>
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Filter criteria: Carousel Playlist Creation Time.</p>
     * @param CreateTime <p>Filter criteria: Carousel Playlist Creation Time.</p>
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Filter criteria: carousel playlist update time.</p> 
     * @return UpdateTime <p>Filter criteria: carousel playlist update time.</p>
     */
    public TimeRange getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Filter criteria: carousel playlist update time.</p>
     * @param UpdateTime <p>Filter criteria: carousel playlist update time.</p>
     */
    public void setUpdateTime(TimeRange UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p> 
     * @return ScrollToken <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p>
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p>
     * @param ScrollToken <p>Scrolling identifier which is used for pulling in batches. If a single request cannot pull all the data entries, the API will return `ScrollToken`, and if the next request carries it, the next pull will start from the next entry.</p>
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get <p>Paging offset. Default value: 0. Deprecated. Perform batch query according to the ScrollToken parameter.</p> 
     * @return Offset <p>Paging offset. Default value: 0. Deprecated. Perform batch query according to the ScrollToken parameter.</p>
     * @deprecated
     */
    @Deprecated
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset. Default value: 0. Deprecated. Perform batch query according to the ScrollToken parameter.</p>
     * @param Offset <p>Paging offset. Default value: 0. Deprecated. Perform batch query according to the ScrollToken parameter.</p>
     * @deprecated
     */
    @Deprecated
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned entries. Default value: 10. Maximum value: 100.</p> 
     * @return Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     * @param Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRoundPlaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoundPlaysRequest(DescribeRoundPlaysRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayIds != null) {
            this.RoundPlayIds = new String[source.RoundPlayIds.length];
            for (int i = 0; i < source.RoundPlayIds.length; i++) {
                this.RoundPlayIds[i] = new String(source.RoundPlayIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new TimeRange(source.UpdateTime);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "RoundPlayIds.", this.RoundPlayIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "UpdateTime.", this.UpdateTime);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

