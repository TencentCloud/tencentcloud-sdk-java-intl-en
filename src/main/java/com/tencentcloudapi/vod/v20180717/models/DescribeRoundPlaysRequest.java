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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoundPlaysRequest extends AbstractModel {

    /**
    * <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Filter criteria: playlist identifier, array length limit: 100.
    */
    @SerializedName("RoundPlayIds")
    @Expose
    private String [] RoundPlayIds;

    /**
    * Filter criteria: playlist status, optional values: <li>enabled: startup status;</li> <li>disabled: stopped status.</li>.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Filter criteria: playlist creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * Filter criteria: playlist update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private TimeRange UpdateTime;

    /**
    * Scrolling identifier which is used for pulling in batches. if a single request cannot pull all the data entries, the API will return `scrolltoken`, and if the next request carries it, the next pull will start from the next entry.
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * Pagination offset, default value: 0. this field is obsolete. please use the `scrolltoken` parameter for batch queries.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. default value: 10. maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>. 
     * @return SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     * @param SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Filter criteria: playlist identifier, array length limit: 100. 
     * @return RoundPlayIds Filter criteria: playlist identifier, array length limit: 100.
     */
    public String [] getRoundPlayIds() {
        return this.RoundPlayIds;
    }

    /**
     * Set Filter criteria: playlist identifier, array length limit: 100.
     * @param RoundPlayIds Filter criteria: playlist identifier, array length limit: 100.
     */
    public void setRoundPlayIds(String [] RoundPlayIds) {
        this.RoundPlayIds = RoundPlayIds;
    }

    /**
     * Get Filter criteria: playlist status, optional values: <li>enabled: startup status;</li> <li>disabled: stopped status.</li>. 
     * @return Status Filter criteria: playlist status, optional values: <li>enabled: startup status;</li> <li>disabled: stopped status.</li>.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Filter criteria: playlist status, optional values: <li>enabled: startup status;</li> <li>disabled: stopped status.</li>.
     * @param Status Filter criteria: playlist status, optional values: <li>enabled: startup status;</li> <li>disabled: stopped status.</li>.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Filter criteria: playlist creation time. 
     * @return CreateTime Filter criteria: playlist creation time.
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Filter criteria: playlist creation time.
     * @param CreateTime Filter criteria: playlist creation time.
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Filter criteria: playlist update time. 
     * @return UpdateTime Filter criteria: playlist update time.
     */
    public TimeRange getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Filter criteria: playlist update time.
     * @param UpdateTime Filter criteria: playlist update time.
     */
    public void setUpdateTime(TimeRange UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Scrolling identifier which is used for pulling in batches. if a single request cannot pull all the data entries, the API will return `scrolltoken`, and if the next request carries it, the next pull will start from the next entry. 
     * @return ScrollToken Scrolling identifier which is used for pulling in batches. if a single request cannot pull all the data entries, the API will return `scrolltoken`, and if the next request carries it, the next pull will start from the next entry.
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set Scrolling identifier which is used for pulling in batches. if a single request cannot pull all the data entries, the API will return `scrolltoken`, and if the next request carries it, the next pull will start from the next entry.
     * @param ScrollToken Scrolling identifier which is used for pulling in batches. if a single request cannot pull all the data entries, the API will return `scrolltoken`, and if the next request carries it, the next pull will start from the next entry.
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get Pagination offset, default value: 0. this field is obsolete. please use the `scrolltoken` parameter for batch queries. 
     * @return Offset Pagination offset, default value: 0. this field is obsolete. please use the `scrolltoken` parameter for batch queries.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, default value: 0. this field is obsolete. please use the `scrolltoken` parameter for batch queries.
     * @param Offset Pagination offset, default value: 0. this field is obsolete. please use the `scrolltoken` parameter for batch queries.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. default value: 10. maximum value: 100. 
     * @return Limit Number of returned entries. default value: 10. maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. default value: 10. maximum value: 100.
     * @param Limit Number of returned entries. default value: 10. maximum value: 100.
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

