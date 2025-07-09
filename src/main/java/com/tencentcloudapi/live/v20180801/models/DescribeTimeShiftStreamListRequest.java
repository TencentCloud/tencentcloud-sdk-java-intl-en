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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimeShiftStreamListRequest extends AbstractModel {

    /**
    * The start time, which must be a Unix timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time, which must be a Unix timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The push domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The group the push domain belongs to.
    */
    @SerializedName("DomainGroup")
    @Expose
    private String DomainGroup;

    /**
    * The maximum number of records to return. Value range: 0-100. If you do not specify this parameter or pass in `0`, 
the default value `100` will be used. If you pass in a negative number or a value greater than 100, an error will be returned.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * The number of page to pull records from. If you do not specify this parameter, the default value `1` will be used.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
     * Get The start time, which must be a Unix timestamp. 
     * @return StartTime The start time, which must be a Unix timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time, which must be a Unix timestamp.
     * @param StartTime The start time, which must be a Unix timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time, which must be a Unix timestamp. 
     * @return EndTime The end time, which must be a Unix timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time, which must be a Unix timestamp.
     * @param EndTime The end time, which must be a Unix timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The stream name. 
     * @return StreamName The stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The stream name.
     * @param StreamName The stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The push domain. 
     * @return Domain The push domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The push domain.
     * @param Domain The push domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The group the push domain belongs to. 
     * @return DomainGroup The group the push domain belongs to.
     */
    public String getDomainGroup() {
        return this.DomainGroup;
    }

    /**
     * Set The group the push domain belongs to.
     * @param DomainGroup The group the push domain belongs to.
     */
    public void setDomainGroup(String DomainGroup) {
        this.DomainGroup = DomainGroup;
    }

    /**
     * Get The maximum number of records to return. Value range: 0-100. If you do not specify this parameter or pass in `0`, 
the default value `100` will be used. If you pass in a negative number or a value greater than 100, an error will be returned. 
     * @return PageSize The maximum number of records to return. Value range: 0-100. If you do not specify this parameter or pass in `0`, 
the default value `100` will be used. If you pass in a negative number or a value greater than 100, an error will be returned.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The maximum number of records to return. Value range: 0-100. If you do not specify this parameter or pass in `0`, 
the default value `100` will be used. If you pass in a negative number or a value greater than 100, an error will be returned.
     * @param PageSize The maximum number of records to return. Value range: 0-100. If you do not specify this parameter or pass in `0`, 
the default value `100` will be used. If you pass in a negative number or a value greater than 100, an error will be returned.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get The number of page to pull records from. If you do not specify this parameter, the default value `1` will be used. 
     * @return PageNum The number of page to pull records from. If you do not specify this parameter, the default value `1` will be used.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set The number of page to pull records from. If you do not specify this parameter, the default value `1` will be used.
     * @param PageNum The number of page to pull records from. If you do not specify this parameter, the default value `1` will be used.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    public DescribeTimeShiftStreamListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimeShiftStreamListRequest(DescribeTimeShiftStreamListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainGroup != null) {
            this.DomainGroup = new String(source.DomainGroup);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainGroup", this.DomainGroup);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);

    }
}

