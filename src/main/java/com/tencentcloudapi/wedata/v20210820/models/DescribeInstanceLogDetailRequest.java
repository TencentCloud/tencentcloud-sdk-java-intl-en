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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceLogDetailRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Data Timestamp
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Server Ip
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * File Name
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * Starting Row
    */
    @SerializedName("StartCount")
    @Expose
    private Long StartCount;

    /**
    * Number of Rows Per Query
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Data Timestamp 
     * @return CurRunDate Data Timestamp
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Data Timestamp
     * @param CurRunDate Data Timestamp
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Server Ip 
     * @return BrokerIp Server Ip
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Server Ip
     * @param BrokerIp Server Ip
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get File Name 
     * @return OriginFileName File Name
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set File Name
     * @param OriginFileName File Name
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get Starting Row 
     * @return StartCount Starting Row
     */
    public Long getStartCount() {
        return this.StartCount;
    }

    /**
     * Set Starting Row
     * @param StartCount Starting Row
     */
    public void setStartCount(Long StartCount) {
        this.StartCount = StartCount;
    }

    /**
     * Get Number of Rows Per Query 
     * @return LineCount Number of Rows Per Query
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set Number of Rows Per Query
     * @param LineCount Number of Rows Per Query
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    public DescribeInstanceLogDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceLogDetailRequest(DescribeInstanceLogDetailRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.OriginFileName != null) {
            this.OriginFileName = new String(source.OriginFileName);
        }
        if (source.StartCount != null) {
            this.StartCount = new Long(source.StartCount);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "StartCount", this.StartCount);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);

    }
}

