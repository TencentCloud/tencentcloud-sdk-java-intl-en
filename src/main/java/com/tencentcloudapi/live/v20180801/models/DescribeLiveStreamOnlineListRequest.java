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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamOnlineListRequest extends AbstractModel{

    /**
    * Push domain name. If you use multiple paths, enter the `DomainName`.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you use multiple paths, enter the `AppName`.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Page number to get. Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page. Maximum value: 100. 
Value: any integer between 10 and 100.
Default value: 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Stream name, which is used for exact query.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get Push domain name. If you use multiple paths, enter the `DomainName`. 
     * @return DomainName Push domain name. If you use multiple paths, enter the `DomainName`.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Push domain name. If you use multiple paths, enter the `DomainName`.
     * @param DomainName Push domain name. If you use multiple paths, enter the `DomainName`.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you use multiple paths, enter the `AppName`. 
     * @return AppName Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you use multiple paths, enter the `AppName`.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you use multiple paths, enter the `AppName`.
     * @param AppName Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you use multiple paths, enter the `AppName`.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Page number to get. Default value: 1. 
     * @return PageNum Page number to get. Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number to get. Default value: 1.
     * @param PageNum Page number to get. Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page. Maximum value: 100. 
Value: any integer between 10 and 100.
Default value: 10. 
     * @return PageSize Number of entries per page. Maximum value: 100. 
Value: any integer between 10 and 100.
Default value: 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Maximum value: 100. 
Value: any integer between 10 and 100.
Default value: 10.
     * @param PageSize Number of entries per page. Maximum value: 100. 
Value: any integer between 10 and 100.
Default value: 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Stream name, which is used for exact query. 
     * @return StreamName Stream name, which is used for exact query.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name, which is used for exact query.
     * @param StreamName Stream name, which is used for exact query.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

