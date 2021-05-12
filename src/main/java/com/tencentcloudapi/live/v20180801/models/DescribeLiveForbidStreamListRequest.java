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

public class DescribeLiveForbidStreamListRequest extends AbstractModel{

    /**
    * Page number to get. Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page. Maximum value: 100. 
Value: any integer between 1 and 100.
Default value: 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * The stream name to search for
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

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
Value: any integer between 1 and 100.
Default value: 10. 
     * @return PageSize Number of entries per page. Maximum value: 100. 
Value: any integer between 1 and 100.
Default value: 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Maximum value: 100. 
Value: any integer between 1 and 100.
Default value: 10.
     * @param PageSize Number of entries per page. Maximum value: 100. 
Value: any integer between 1 and 100.
Default value: 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get The stream name to search for 
     * @return StreamName The stream name to search for
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The stream name to search for
     * @param StreamName The stream name to search for
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    public DescribeLiveForbidStreamListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveForbidStreamListRequest(DescribeLiveForbidStreamListRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

