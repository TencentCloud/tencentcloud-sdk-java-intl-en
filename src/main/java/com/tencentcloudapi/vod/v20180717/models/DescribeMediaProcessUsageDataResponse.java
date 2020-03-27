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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaProcessUsageDataResponse extends AbstractModel{

    /**
    * Overview of video processing statistics, which displays the overview and details of queried tasks.
    */
    @SerializedName("MediaProcessDataSet")
    @Expose
    private TaskStatData [] MediaProcessDataSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Overview of video processing statistics, which displays the overview and details of queried tasks. 
     * @return MediaProcessDataSet Overview of video processing statistics, which displays the overview and details of queried tasks.
     */
    public TaskStatData [] getMediaProcessDataSet() {
        return this.MediaProcessDataSet;
    }

    /**
     * Set Overview of video processing statistics, which displays the overview and details of queried tasks.
     * @param MediaProcessDataSet Overview of video processing statistics, which displays the overview and details of queried tasks.
     */
    public void setMediaProcessDataSet(TaskStatData [] MediaProcessDataSet) {
        this.MediaProcessDataSet = MediaProcessDataSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MediaProcessDataSet.", this.MediaProcessDataSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

