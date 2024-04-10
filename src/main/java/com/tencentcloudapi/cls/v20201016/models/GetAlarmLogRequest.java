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

public class GetAlarmLogRequest extends AbstractModel {

    /**
    * Start time of the execution detail to be queried, Unix timestamp, unit: ms.
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of the execution detail to be queried, Unix timestamp, unit: ms.
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Query filter criteria, for example:
- Query by alert policy ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971"`
- Query by monitoring object ID: `monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b" `
- Query by alarm policy ID and monitoring object ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971" AND monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b"`
- Query by alarm policy ID and monitoring object ID, supports SQL statement: `(alert_id:"alarm-5ce45495-09e8-4d58-xxxx-768134bf330c") AND (monitored_object:"3c514e84-6f1f-46ec-xxxx-05de6163f7fe") AND NOT condition_evaluate_result: "Skip" AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result='ProcessError') as top50StatisticsFailureCount, count_if(notification_send_result!='NotSend') as top50NoticeTotalCount, count_if(notification_send_result='SendPartFail' or notification_send_result='SendFail') as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1`
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * The maximum number of execution details returned in a single query is 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Whether the original logs are returned in time order. Optional values are: asc (ascending) or desc (descending). The default is descNote:* This is only valid when the search and analysis statement (Query) does not contain SQL* For SQL result sorting, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * true: Indicates the use of the new retrieval result return method, with valid output parameters AnalysisRecords and Columns.false: Indicates the use of the old retrieval result return method, with valid output parameters AnalysisResults and ColNames.There is a slight difference in encoding format between the two return methods, and it is recommended to use true.
    */
    @SerializedName("UseNewAnalysis")
    @Expose
    private Boolean UseNewAnalysis;

    /**
     * Get Start time of the execution detail to be queried, Unix timestamp, unit: ms. 
     * @return From Start time of the execution detail to be queried, Unix timestamp, unit: ms.
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time of the execution detail to be queried, Unix timestamp, unit: ms.
     * @param From Start time of the execution detail to be queried, Unix timestamp, unit: ms.
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of the execution detail to be queried, Unix timestamp, unit: ms. 
     * @return To End time of the execution detail to be queried, Unix timestamp, unit: ms.
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of the execution detail to be queried, Unix timestamp, unit: ms.
     * @param To End time of the execution detail to be queried, Unix timestamp, unit: ms.
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Query filter criteria, for example:
- Query by alert policy ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971"`
- Query by monitoring object ID: `monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b" `
- Query by alarm policy ID and monitoring object ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971" AND monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b"`
- Query by alarm policy ID and monitoring object ID, supports SQL statement: `(alert_id:"alarm-5ce45495-09e8-4d58-xxxx-768134bf330c") AND (monitored_object:"3c514e84-6f1f-46ec-xxxx-05de6163f7fe") AND NOT condition_evaluate_result: "Skip" AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result='ProcessError') as top50StatisticsFailureCount, count_if(notification_send_result!='NotSend') as top50NoticeTotalCount, count_if(notification_send_result='SendPartFail' or notification_send_result='SendFail') as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1` 
     * @return Query Query filter criteria, for example:
- Query by alert policy ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971"`
- Query by monitoring object ID: `monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b" `
- Query by alarm policy ID and monitoring object ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971" AND monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b"`
- Query by alarm policy ID and monitoring object ID, supports SQL statement: `(alert_id:"alarm-5ce45495-09e8-4d58-xxxx-768134bf330c") AND (monitored_object:"3c514e84-6f1f-46ec-xxxx-05de6163f7fe") AND NOT condition_evaluate_result: "Skip" AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result='ProcessError') as top50StatisticsFailureCount, count_if(notification_send_result!='NotSend') as top50NoticeTotalCount, count_if(notification_send_result='SendPartFail' or notification_send_result='SendFail') as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1`
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query filter criteria, for example:
- Query by alert policy ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971"`
- Query by monitoring object ID: `monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b" `
- Query by alarm policy ID and monitoring object ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971" AND monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b"`
- Query by alarm policy ID and monitoring object ID, supports SQL statement: `(alert_id:"alarm-5ce45495-09e8-4d58-xxxx-768134bf330c") AND (monitored_object:"3c514e84-6f1f-46ec-xxxx-05de6163f7fe") AND NOT condition_evaluate_result: "Skip" AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result='ProcessError') as top50StatisticsFailureCount, count_if(notification_send_result!='NotSend') as top50NoticeTotalCount, count_if(notification_send_result='SendPartFail' or notification_send_result='SendFail') as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1`
     * @param Query Query filter criteria, for example:
- Query by alert policy ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971"`
- Query by monitoring object ID: `monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b" `
- Query by alarm policy ID and monitoring object ID: `alert_id:"alarm-0745ec00-e605-xxxx-b50b-54afe61fc971" AND monitored_object:"823d8bfa-76a7-xxxx-8399-8cda74d4009b"`
- Query by alarm policy ID and monitoring object ID, supports SQL statement: `(alert_id:"alarm-5ce45495-09e8-4d58-xxxx-768134bf330c") AND (monitored_object:"3c514e84-6f1f-46ec-xxxx-05de6163f7fe") AND NOT condition_evaluate_result: "Skip" AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result='ProcessError') as top50StatisticsFailureCount, count_if(notification_send_result!='NotSend') as top50NoticeTotalCount, count_if(notification_send_result='SendPartFail' or notification_send_result='SendFail') as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1`
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get The maximum number of execution details returned in a single query is 1000. 
     * @return Limit The maximum number of execution details returned in a single query is 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of execution details returned in a single query is 1000.
     * @param Limit The maximum number of execution details returned in a single query is 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a> 
     * @return Context Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     * @param Context Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Whether the original logs are returned in time order. Optional values are: asc (ascending) or desc (descending). The default is descNote:* This is only valid when the search and analysis statement (Query) does not contain SQL* For SQL result sorting, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a> 
     * @return Sort Whether the original logs are returned in time order. Optional values are: asc (ascending) or desc (descending). The default is descNote:* This is only valid when the search and analysis statement (Query) does not contain SQL* For SQL result sorting, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Whether the original logs are returned in time order. Optional values are: asc (ascending) or desc (descending). The default is descNote:* This is only valid when the search and analysis statement (Query) does not contain SQL* For SQL result sorting, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>
     * @param Sort Whether the original logs are returned in time order. Optional values are: asc (ascending) or desc (descending). The default is descNote:* This is only valid when the search and analysis statement (Query) does not contain SQL* For SQL result sorting, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get true: Indicates the use of the new retrieval result return method, with valid output parameters AnalysisRecords and Columns.false: Indicates the use of the old retrieval result return method, with valid output parameters AnalysisResults and ColNames.There is a slight difference in encoding format between the two return methods, and it is recommended to use true. 
     * @return UseNewAnalysis true: Indicates the use of the new retrieval result return method, with valid output parameters AnalysisRecords and Columns.false: Indicates the use of the old retrieval result return method, with valid output parameters AnalysisResults and ColNames.There is a slight difference in encoding format between the two return methods, and it is recommended to use true.
     */
    public Boolean getUseNewAnalysis() {
        return this.UseNewAnalysis;
    }

    /**
     * Set true: Indicates the use of the new retrieval result return method, with valid output parameters AnalysisRecords and Columns.false: Indicates the use of the old retrieval result return method, with valid output parameters AnalysisResults and ColNames.There is a slight difference in encoding format between the two return methods, and it is recommended to use true.
     * @param UseNewAnalysis true: Indicates the use of the new retrieval result return method, with valid output parameters AnalysisRecords and Columns.false: Indicates the use of the old retrieval result return method, with valid output parameters AnalysisResults and ColNames.There is a slight difference in encoding format between the two return methods, and it is recommended to use true.
     */
    public void setUseNewAnalysis(Boolean UseNewAnalysis) {
        this.UseNewAnalysis = UseNewAnalysis;
    }

    public GetAlarmLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAlarmLogRequest(GetAlarmLogRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.UseNewAnalysis != null) {
            this.UseNewAnalysis = new Boolean(source.UseNewAnalysis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "UseNewAnalysis", this.UseNewAnalysis);

    }
}

