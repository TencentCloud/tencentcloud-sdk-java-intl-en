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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogContextRequest extends AbstractModel {

    /**
    * Log topic Id to query.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log time, which is the Time in the Results structure in the returned information of the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api, should be converted from the millisecond-level Unix timestamp to a string in the YYYY-mm-dd HH:MM:SS.FFF format according to the UTC+8 time zone.
    */
    @SerializedName("BTime")
    @Expose
    private String BTime;

    /**
    * Log package sequence number, which is the PkgId in the Results structure returned by the retrieve and analyze logs api (https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1).
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * Sequence number of a log within the log package, which is the PkgLogId in the Results structure returned by the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api.
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
    * Query statement, filtering the log context with a maximum length of 12KB
The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval criteria]</a> and does not support SQL statement.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Context search start time, unit: millisecond-level timestamp
Note:
-When From is empty, it means no restrictions on the start time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region.
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of context search. Measurement unit: millisecond-level timestamp.
Note:
-When To is empty, it means no restrictions on the end time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region.
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
     * Get Log topic Id to query.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). 
     * @return TopicId Log topic Id to query.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic Id to query.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     * @param TopicId Log topic Id to query.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log time, which is the Time in the Results structure in the returned information of the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api, should be converted from the millisecond-level Unix timestamp to a string in the YYYY-mm-dd HH:MM:SS.FFF format according to the UTC+8 time zone. 
     * @return BTime Log time, which is the Time in the Results structure in the returned information of the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api, should be converted from the millisecond-level Unix timestamp to a string in the YYYY-mm-dd HH:MM:SS.FFF format according to the UTC+8 time zone.
     */
    public String getBTime() {
        return this.BTime;
    }

    /**
     * Set Log time, which is the Time in the Results structure in the returned information of the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api, should be converted from the millisecond-level Unix timestamp to a string in the YYYY-mm-dd HH:MM:SS.FFF format according to the UTC+8 time zone.
     * @param BTime Log time, which is the Time in the Results structure in the returned information of the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api, should be converted from the millisecond-level Unix timestamp to a string in the YYYY-mm-dd HH:MM:SS.FFF format according to the UTC+8 time zone.
     */
    public void setBTime(String BTime) {
        this.BTime = BTime;
    }

    /**
     * Get Log package sequence number, which is the PkgId in the Results structure returned by the retrieve and analyze logs api (https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1). 
     * @return PkgId Log package sequence number, which is the PkgId in the Results structure returned by the retrieve and analyze logs api (https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1).
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set Log package sequence number, which is the PkgId in the Results structure returned by the retrieve and analyze logs api (https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1).
     * @param PkgId Log package sequence number, which is the PkgId in the Results structure returned by the retrieve and analyze logs api (https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1).
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get Sequence number of a log within the log package, which is the PkgLogId in the Results structure returned by the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api. 
     * @return PkgLogId Sequence number of a log within the log package, which is the PkgLogId in the Results structure returned by the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api.
     */
    public Long getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set Sequence number of a log within the log package, which is the PkgLogId in the Results structure returned by the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api.
     * @param PkgLogId Sequence number of a log within the log package, which is the PkgLogId in the Results structure returned by the [retrieve and analyze logs](https://www.tencentcloud.com/document/product/614/56447?from_cn_redirect=1) api.
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

    /**
     * Get Query statement, filtering the log context with a maximum length of 12KB
The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval criteria]</a> and does not support SQL statement. 
     * @return Query Query statement, filtering the log context with a maximum length of 12KB
The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval criteria]</a> and does not support SQL statement.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement, filtering the log context with a maximum length of 12KB
The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval criteria]</a> and does not support SQL statement.
     * @param Query Query statement, filtering the log context with a maximum length of 12KB
The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval criteria]</a> and does not support SQL statement.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Context search start time, unit: millisecond-level timestamp
Note:
-When From is empty, it means no restrictions on the start time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region. 
     * @return From Context search start time, unit: millisecond-level timestamp
Note:
-When From is empty, it means no restrictions on the start time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region.
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Context search start time, unit: millisecond-level timestamp
Note:
-When From is empty, it means no restrictions on the start time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region.
     * @param From Context search start time, unit: millisecond-level timestamp
Note:
-When From is empty, it means no restrictions on the start time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region.
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of context search. Measurement unit: millisecond-level timestamp.
Note:
-When To is empty, it means no restrictions on the end time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region. 
     * @return To End time of context search. Measurement unit: millisecond-level timestamp.
Note:
-When To is empty, it means no restrictions on the end time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region.
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of context search. Measurement unit: millisecond-level timestamp.
Note:
-When To is empty, it means no restrictions on the end time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region.
     * @param To End time of context search. Measurement unit: millisecond-level timestamp.
Note:
-When To is empty, it means no restrictions on the end time of context search.
-From and To are not empty, From < To
-Currently, the system only supports the Shanghai/Virginia/Singapore region.
     */
    public void setTo(Long To) {
        this.To = To;
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
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
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
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);

    }
}

