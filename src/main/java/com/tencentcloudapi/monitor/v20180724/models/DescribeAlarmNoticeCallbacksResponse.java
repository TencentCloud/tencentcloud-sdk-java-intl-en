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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmNoticeCallbacksResponse extends AbstractModel {

    /**
    * Alarm callback notification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("URLNotices")
    @Expose
    private URLNotice [] URLNotices;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Alarm callback notification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return URLNotices Alarm callback notification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public URLNotice [] getURLNotices() {
        return this.URLNotices;
    }

    /**
     * Set Alarm callback notification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param URLNotices Alarm callback notification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setURLNotices(URLNotice [] URLNotices) {
        this.URLNotices = URLNotices;
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

    public DescribeAlarmNoticeCallbacksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmNoticeCallbacksResponse(DescribeAlarmNoticeCallbacksResponse source) {
        if (source.URLNotices != null) {
            this.URLNotices = new URLNotice[source.URLNotices.length];
            for (int i = 0; i < source.URLNotices.length; i++) {
                this.URLNotices[i] = new URLNotice(source.URLNotices[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "URLNotices.", this.URLNotices);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

