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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListReleaseConfigPreviewRequest extends AbstractModel {

    /**
    * Robot ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Page number.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Query content.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Release ticket ID.
    */
    @SerializedName("ReleaseBizId")
    @Expose
    private String ReleaseBizId;

    /**
    * Status (1: newly-added; 2: updated; 3: deleted).
    */
    @SerializedName("Actions")
    @Expose
    private Long [] Actions;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Release status.
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Long [] ReleaseStatus;

    /**
     * Get Robot ID. 
     * @return BotBizId Robot ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Robot ID.
     * @param BotBizId Robot ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Page number. 
     * @return PageNumber Page number.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number.
     * @param PageNumber Page number.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. 
     * @return PageSize Number of items per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page.
     * @param PageSize Number of items per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Query content. 
     * @return Query Query content.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query content.
     * @param Query Query content.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Release ticket ID. 
     * @return ReleaseBizId Release ticket ID.
     */
    public String getReleaseBizId() {
        return this.ReleaseBizId;
    }

    /**
     * Set Release ticket ID.
     * @param ReleaseBizId Release ticket ID.
     */
    public void setReleaseBizId(String ReleaseBizId) {
        this.ReleaseBizId = ReleaseBizId;
    }

    /**
     * Get Status (1: newly-added; 2: updated; 3: deleted). 
     * @return Actions Status (1: newly-added; 2: updated; 3: deleted).
     */
    public Long [] getActions() {
        return this.Actions;
    }

    /**
     * Set Status (1: newly-added; 2: updated; 3: deleted).
     * @param Actions Status (1: newly-added; 2: updated; 3: deleted).
     */
    public void setActions(Long [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Release status. 
     * @return ReleaseStatus Release status.
     */
    public Long [] getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set Release status.
     * @param ReleaseStatus Release status.
     */
    public void setReleaseStatus(Long [] ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    public ListReleaseConfigPreviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReleaseConfigPreviewRequest(ListReleaseConfigPreviewRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.ReleaseBizId != null) {
            this.ReleaseBizId = new String(source.ReleaseBizId);
        }
        if (source.Actions != null) {
            this.Actions = new Long[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new Long(source.Actions[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Long[source.ReleaseStatus.length];
            for (int i = 0; i < source.ReleaseStatus.length; i++) {
                this.ReleaseStatus[i] = new Long(source.ReleaseStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "ReleaseBizId", this.ReleaseBizId);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "ReleaseStatus.", this.ReleaseStatus);

    }
}

