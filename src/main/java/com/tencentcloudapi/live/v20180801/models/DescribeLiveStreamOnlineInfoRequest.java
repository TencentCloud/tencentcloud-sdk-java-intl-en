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

public class DescribeLiveStreamOnlineInfoRequest extends AbstractModel{

    /**
    * Page number to get.
Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 0: push not started; 1: pushing.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get Page number to get.
Default value: 1. 
     * @return PageNum Page number to get.
Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number to get.
Default value: 1.
     * @param PageNum Page number to get.
Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10. 
     * @return PageSize Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
     * @param PageSize Number of entries per page.
Maximum value: 100.
Value range: any integer between 1 and 100.
Default value: 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 0: push not started; 1: pushing. 
     * @return Status 0: push not started; 1: pushing.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: push not started; 1: pushing.
     * @param Status 0: push not started; 1: pushing.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

