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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListBlackEmailAddressRequest extends AbstractModel{

    /**
    * Start date in the format of `YYYY-MM-DD`
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * End date in the format of `YYYY-MM-DD`
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Common parameter. It must be used with `Offset`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Common parameter. It must be used with `Limit`. Maximum value of `Limit`: `100`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * You can specify an email address to query.
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * You can specify a task ID to query.
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
     * Get Start date in the format of `YYYY-MM-DD` 
     * @return StartDate Start date in the format of `YYYY-MM-DD`
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Start date in the format of `YYYY-MM-DD`
     * @param StartDate Start date in the format of `YYYY-MM-DD`
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get End date in the format of `YYYY-MM-DD` 
     * @return EndDate End date in the format of `YYYY-MM-DD`
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End date in the format of `YYYY-MM-DD`
     * @param EndDate End date in the format of `YYYY-MM-DD`
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Common parameter. It must be used with `Offset`. 
     * @return Limit Common parameter. It must be used with `Offset`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Common parameter. It must be used with `Offset`.
     * @param Limit Common parameter. It must be used with `Offset`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Common parameter. It must be used with `Limit`. Maximum value of `Limit`: `100`. 
     * @return Offset Common parameter. It must be used with `Limit`. Maximum value of `Limit`: `100`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Common parameter. It must be used with `Limit`. Maximum value of `Limit`: `100`.
     * @param Offset Common parameter. It must be used with `Limit`. Maximum value of `Limit`: `100`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get You can specify an email address to query. 
     * @return EmailAddress You can specify an email address to query.
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set You can specify an email address to query.
     * @param EmailAddress You can specify an email address to query.
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get You can specify a task ID to query. 
     * @return TaskID You can specify a task ID to query.
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set You can specify a task ID to query.
     * @param TaskID You can specify a task ID to query.
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);

    }
}

