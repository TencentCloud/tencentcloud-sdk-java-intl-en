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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertChannelRequest extends AbstractModel {

    /**
    * The NoticeId of alarm notification template in the monitor service, can be obtained from the Id field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or NoticeId can be used to identify an alarm notification template.)
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * The AMPConsumerId of alarm notification template for monitor service, can be obtained from the AMPConsumerId field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or Noticeid can be used to identify an alarm notification template.)
    */
    @SerializedName("AMPConsumerId")
    @Expose
    private String AMPConsumerId;

    /**
     * Get The NoticeId of alarm notification template in the monitor service, can be obtained from the Id field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or NoticeId can be used to identify an alarm notification template.) 
     * @return NoticeId The NoticeId of alarm notification template in the monitor service, can be obtained from the Id field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or NoticeId can be used to identify an alarm notification template.)
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set The NoticeId of alarm notification template in the monitor service, can be obtained from the Id field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or NoticeId can be used to identify an alarm notification template.)
     * @param NoticeId The NoticeId of alarm notification template in the monitor service, can be obtained from the Id field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or NoticeId can be used to identify an alarm notification template.)
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The AMPConsumerId of alarm notification template for monitor service, can be obtained from the AMPConsumerId field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or Noticeid can be used to identify an alarm notification template.) 
     * @return AMPConsumerId The AMPConsumerId of alarm notification template for monitor service, can be obtained from the AMPConsumerId field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or Noticeid can be used to identify an alarm notification template.)
     */
    public String getAMPConsumerId() {
        return this.AMPConsumerId;
    }

    /**
     * Set The AMPConsumerId of alarm notification template for monitor service, can be obtained from the AMPConsumerId field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or Noticeid can be used to identify an alarm notification template.)
     * @param AMPConsumerId The AMPConsumerId of alarm notification template for monitor service, can be obtained from the AMPConsumerId field in the response of the DescribeAlarmNotices API of the monitor service's cloud API. (In the input parameters of the CreateAlertChannel API, either AMPConsumerId or Noticeid can be used to identify an alarm notification template.)
     */
    public void setAMPConsumerId(String AMPConsumerId) {
        this.AMPConsumerId = AMPConsumerId;
    }

    public CreateAlertChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertChannelRequest(CreateAlertChannelRequest source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AMPConsumerId != null) {
            this.AMPConsumerId = new String(source.AMPConsumerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AMPConsumerId", this.AMPConsumerId);

    }
}

