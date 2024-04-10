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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogContextRequest extends AbstractModel {

    /**
    * Log topic ID to be queried
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log time in the format of YYYY-mm-dd HH:MM:SS.FFF
    */
    @SerializedName("BTime")
    @Expose
    private String BTime;

    /**
    * Log package sequence number. PkgId in the Results structure of the returned information of SearchLog API.
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * Sequence number of a log within the log package.
The PkgLogId in the Results structure of the SearchLog API returned information.
    */
    @SerializedName("PkgLogId")
    @Expose
    private Long PkgLogId;

    /**
    * The previous ${PrevLogs} logs. Default value: 10.
    */
    @SerializedName("PrevLogs")
    @Expose
    private Long PrevLogs;

    /**
    * The next ${NextLogs} logs. Default value: 10.
    */
    @SerializedName("NextLogs")
    @Expose
    private Long NextLogs;

    /**
     * Get Log topic ID to be queried 
     * @return TopicId Log topic ID to be queried
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID to be queried
     * @param TopicId Log topic ID to be queried
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log time in the format of YYYY-mm-dd HH:MM:SS.FFF 
     * @return BTime Log time in the format of YYYY-mm-dd HH:MM:SS.FFF
     */
    public String getBTime() {
        return this.BTime;
    }

    /**
     * Set Log time in the format of YYYY-mm-dd HH:MM:SS.FFF
     * @param BTime Log time in the format of YYYY-mm-dd HH:MM:SS.FFF
     */
    public void setBTime(String BTime) {
        this.BTime = BTime;
    }

    /**
     * Get Log package sequence number. PkgId in the Results structure of the returned information of SearchLog API. 
     * @return PkgId Log package sequence number. PkgId in the Results structure of the returned information of SearchLog API.
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set Log package sequence number. PkgId in the Results structure of the returned information of SearchLog API.
     * @param PkgId Log package sequence number. PkgId in the Results structure of the returned information of SearchLog API.
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get Sequence number of a log within the log package.
The PkgLogId in the Results structure of the SearchLog API returned information. 
     * @return PkgLogId Sequence number of a log within the log package.
The PkgLogId in the Results structure of the SearchLog API returned information.
     */
    public Long getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set Sequence number of a log within the log package.
The PkgLogId in the Results structure of the SearchLog API returned information.
     * @param PkgLogId Sequence number of a log within the log package.
The PkgLogId in the Results structure of the SearchLog API returned information.
     */
    public void setPkgLogId(Long PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get The previous ${PrevLogs} logs. Default value: 10. 
     * @return PrevLogs The previous ${PrevLogs} logs. Default value: 10.
     */
    public Long getPrevLogs() {
        return this.PrevLogs;
    }

    /**
     * Set The previous ${PrevLogs} logs. Default value: 10.
     * @param PrevLogs The previous ${PrevLogs} logs. Default value: 10.
     */
    public void setPrevLogs(Long PrevLogs) {
        this.PrevLogs = PrevLogs;
    }

    /**
     * Get The next ${NextLogs} logs. Default value: 10. 
     * @return NextLogs The next ${NextLogs} logs. Default value: 10.
     */
    public Long getNextLogs() {
        return this.NextLogs;
    }

    /**
     * Set The next ${NextLogs} logs. Default value: 10.
     * @param NextLogs The next ${NextLogs} logs. Default value: 10.
     */
    public void setNextLogs(Long NextLogs) {
        this.NextLogs = NextLogs;
    }

    public DescribeLogContextRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogContextRequest(DescribeLogContextRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.BTime != null) {
            this.BTime = new String(source.BTime);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new Long(source.PkgLogId);
        }
        if (source.PrevLogs != null) {
            this.PrevLogs = new Long(source.PrevLogs);
        }
        if (source.NextLogs != null) {
            this.NextLogs = new Long(source.NextLogs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "BTime", this.BTime);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "PrevLogs", this.PrevLogs);
        this.setParamSimple(map, prefix + "NextLogs", this.NextLogs);

    }
}

