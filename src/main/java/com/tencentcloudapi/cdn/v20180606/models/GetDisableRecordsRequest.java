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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDisableRecordsRequest extends AbstractModel{

    /**
    * Starting time, such as `2018-12-12 10:24:00`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, such as 2018-12-14 10:24:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies the URL to be queried
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Current URL status
disable: The URL remains disabled, and accessing it will return an error 403
enable: The URL is enabled (unblocked) and can be normally accessed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Offset for paginated queries. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paged queries. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Starting time, such as `2018-12-12 10:24:00` 
     * @return StartTime Starting time, such as `2018-12-12 10:24:00`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Starting time, such as `2018-12-12 10:24:00`
     * @param StartTime Starting time, such as `2018-12-12 10:24:00`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, such as 2018-12-14 10:24:00 
     * @return EndTime End time, such as 2018-12-14 10:24:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, such as 2018-12-14 10:24:00
     * @param EndTime End time, such as 2018-12-14 10:24:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies the URL to be queried 
     * @return Url Specifies the URL to be queried
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Specifies the URL to be queried
     * @param Url Specifies the URL to be queried
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Current URL status
disable: The URL remains disabled, and accessing it will return an error 403
enable: The URL is enabled (unblocked) and can be normally accessed 
     * @return Status Current URL status
disable: The URL remains disabled, and accessing it will return an error 403
enable: The URL is enabled (unblocked) and can be normally accessed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current URL status
disable: The URL remains disabled, and accessing it will return an error 403
enable: The URL is enabled (unblocked) and can be normally accessed
     * @param Status Current URL status
disable: The URL remains disabled, and accessing it will return an error 403
enable: The URL is enabled (unblocked) and can be normally accessed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Offset for paginated queries. Default value: 0 
     * @return Offset Offset for paginated queries. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: 0
     * @param Offset Offset for paginated queries. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paged queries. Default value: 20 
     * @return Limit Limit on paged queries. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paged queries. Default value: 20
     * @param Limit Limit on paged queries. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public GetDisableRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDisableRecordsRequest(GetDisableRecordsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

