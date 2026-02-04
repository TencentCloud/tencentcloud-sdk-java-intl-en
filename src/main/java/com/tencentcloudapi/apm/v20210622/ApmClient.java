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
package com.tencentcloudapi.apm.v20210622;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.apm.v20210622.models.*;

public class ApmClient extends AbstractClient{
    private static String endpoint = "apm.intl.tencentcloudapi.com";
    private static String service = "apm";
    private static String version = "2021-06-22";

    public ApmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApmClient(Credential credential, String region, ClientProfile profile) {
        super(ApmClient.endpoint, ApmClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a business purchase in the APM business system.
     * @param req CreateApmInstanceRequest
     * @return CreateApmInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateApmInstanceResponse CreateApmInstance(CreateApmInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApmInstance", CreateApmInstanceResponse.class);
    }

    /**
     *This API is used to create metric match rules between apm Business System and Prometheus Instance.
     * @param req CreateApmPrometheusRuleRequest
     * @return CreateApmPrometheusRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApmPrometheusRuleResponse CreateApmPrometheusRule(CreateApmPrometheusRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApmPrometheusRule", CreateApmPrometheusRuleResponse.class);
    }

    /**
     *Create sampling configurations
     * @param req CreateApmSampleConfigRequest
     * @return CreateApmSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateApmSampleConfigResponse CreateApmSampleConfig(CreateApmSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApmSampleConfig", CreateApmSampleConfigResponse.class);
    }

    /**
     *This API is used to create an event task.
     * @param req CreateProfileTaskRequest
     * @return CreateProfileTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateProfileTaskResponse CreateProfileTask(CreateProfileTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProfileTask", CreateProfileTaskResponse.class);
    }

    /**
     *Delete sampling configurations
     * @param req DeleteApmSampleConfigRequest
     * @return DeleteApmSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApmSampleConfigResponse DeleteApmSampleConfig(DeleteApmSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApmSampleConfig", DeleteApmSampleConfigResponse.class);
    }

    /**
     *Obtaining APM Access Point.
     * @param req DescribeApmAgentRequest
     * @return DescribeApmAgentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmAgentResponse DescribeApmAgent(DescribeApmAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmAgent", DescribeApmAgentResponse.class);
    }

    /**
     *This API is used to query application configuration.
     * @param req DescribeApmApplicationConfigRequest
     * @return DescribeApmApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmApplicationConfigResponse DescribeApmApplicationConfig(DescribeApmApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmApplicationConfig", DescribeApmApplicationConfigResponse.class);
    }

    /**
     *This API is used to query the relationship between apm Business System and other product.
     * @param req DescribeApmAssociationRequest
     * @return DescribeApmAssociationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmAssociationResponse DescribeApmAssociation(DescribeApmAssociationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmAssociation", DescribeApmAssociationResponse.class);
    }

    /**
     *This API is used to obtain the list of APM business systems.
     * @param req DescribeApmInstancesRequest
     * @return DescribeApmInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmInstancesResponse DescribeApmInstances(DescribeApmInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmInstances", DescribeApmInstancesResponse.class);
    }

    /**
     *This API is used to query the match rule for metrics between apm Business System and Prometheus Instance.
     * @param req DescribeApmPrometheusRuleRequest
     * @return DescribeApmPrometheusRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmPrometheusRuleResponse DescribeApmPrometheusRule(DescribeApmPrometheusRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmPrometheusRule", DescribeApmPrometheusRuleResponse.class);
    }

    /**
     *Query sampling configuration
     * @param req DescribeApmSampleConfigRequest
     * @return DescribeApmSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmSampleConfigResponse DescribeApmSampleConfig(DescribeApmSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmSampleConfig", DescribeApmSampleConfigResponse.class);
    }

    /**
     *This API is used to obtain the list of APM application metrics.
     * @param req DescribeApmServiceMetricRequest
     * @return DescribeApmServiceMetricResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmServiceMetricResponse DescribeApmServiceMetric(DescribeApmServiceMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmServiceMetric", DescribeApmServiceMetricResponse.class);
    }

    /**
     *This API is used to query the application configuration information.
     * @param req DescribeGeneralApmApplicationConfigRequest
     * @return DescribeGeneralApmApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralApmApplicationConfigResponse DescribeGeneralApmApplicationConfig(DescribeGeneralApmApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralApmApplicationConfig", DescribeGeneralApmApplicationConfigResponse.class);
    }

    /**
     *This API is a general API used to obtain metric data. Users submit request parameters as needed and receive the corresponding metric data.
The API call frequency is limited to 20 requests per second and 1200 requests per minute. The number of data points per request is limited to 1440.
**Usage of the General Interface for Fetching Metric Data**
DescribeGeneralMetricData is a general interface for querying metric data, supporting flexible data retrieval. The query method of this interface is similar to using the following SQL statement:
SELECT {Metrics} FROM {ViewName} WHERE {Filters} GROUP BY {GroupBy}.
1. View (ViewName)
Determines the data domain you want to query.
Examples: service_metric (Service Monitoring View), db_metric (Database View), etc. For views supported by APM, please refer to [Metric Views](https://www.tencentcloud.com/document/product/248/68462?has_map=1&lang=en&pg=)
2. Metrics (Metrics)
Used to specify one or more metric items to be included in the returned results.
Examples: request_count (Total Requests), duration_avg (Average Latency), error_rate (Error Rate). For metrics supported by APM, please refer to the [APM Metric Protocol Standard](https://www.tencentcloud.com/document/product/248/68462?has_map=1&lang=en&pg=).
3. Filters (Filters)
Supports one or more filtering conditions in the form of Key-Value pairs.
Example: Querying only a specific service: service.name = "order-service". Common dimensions and specific dimensions supported by each ViewName can be used as keys in filtering conditions. For more details, please refer to the [APM Metric Protocol Standard](https://www.tencentcloud.com/document/product/248/68462?has_map=1&lang=en&pg=).
4. Aggregation (GroupBy)
Supports one or more aggregation dimensions, equivalent to the GROUP BY clause in SQL.
Example: Grouping by the interface name operation to view the performance of each interface. Common dimensions and specific dimensions supported by each ViewName can be used as aggregation dimensions. For more details, please refer to the [APM Metric Protocol Standard](https://www.tencentcloud.com/document/product/248/68462?has_map=1&lang=en&pg=).
5. Granularity (Period)
This parameter determines whether the data needs to be aggregated by time slices.
    - Period = 1 (Time Series Mode): The returned results are aggregated by time slices. The multiple values contained in the TimeSerial and DataSerial correspond one-to-one, representing the aggregation results for specific time slices. Time Series Mode is primarily used for displaying time trend charts.
    - Period = 0 (Summary Statistics Mode): In the returned results, the DataSerial contains only a single value, representing the summarized data for the entire time range.
     * @param req DescribeGeneralMetricDataRequest
     * @return DescribeGeneralMetricDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralMetricDataResponse DescribeGeneralMetricData(DescribeGeneralMetricDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralMetricData", DescribeGeneralMetricDataResponse.class);
    }

    /**
     *General Query OpenTelemetry Call Chain List.
     * @param req DescribeGeneralOTSpanListRequest
     * @return DescribeGeneralOTSpanListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralOTSpanListResponse DescribeGeneralOTSpanList(DescribeGeneralOTSpanListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralOTSpanList", DescribeGeneralOTSpanListResponse.class);
    }

    /**
     *General Query Call Chain List.
     * @param req DescribeGeneralSpanListRequest
     * @return DescribeGeneralSpanListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralSpanListResponse DescribeGeneralSpanList(DescribeGeneralSpanListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralSpanList", DescribeGeneralSpanListResponse.class);
    }

    /**
     *This API is used to query metric list. To query metrics, it is recommended to use the DescribeGeneralMetricData API.
     * @param req DescribeMetricRecordsRequest
     * @return DescribeMetricRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricRecordsResponse DescribeMetricRecords(DescribeMetricRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricRecords", DescribeMetricRecordsResponse.class);
    }

    /**
     *This API is used to pull application overview data.
     * @param req DescribeServiceOverviewRequest
     * @return DescribeServiceOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceOverviewResponse DescribeServiceOverview(DescribeServiceOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceOverview", DescribeServiceOverviewResponse.class);
    }

    /**
     *This API is used to query dimensional data by dimension name and filter condition.
     * @param req DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesResponse DescribeTagValues(DescribeTagValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagValues", DescribeTagValuesResponse.class);
    }

    /**
     *Modify application configurations
     * @param req ModifyApmApplicationConfigRequest
     * @return ModifyApmApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmApplicationConfigResponse ModifyApmApplicationConfig(ModifyApmApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmApplicationConfig", ModifyApmApplicationConfigResponse.class);
    }

    /**
     *This API is used to modify the relationship between the apm Business System and other products, including deletion.
     * @param req ModifyApmAssociationRequest
     * @return ModifyApmAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmAssociationResponse ModifyApmAssociation(ModifyApmAssociationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmAssociation", ModifyApmAssociationResponse.class);
    }

    /**
     *This API is used to modify the APM business system.
     * @param req ModifyApmInstanceRequest
     * @return ModifyApmInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmInstanceResponse ModifyApmInstance(ModifyApmInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmInstance", ModifyApmInstanceResponse.class);
    }

    /**
     *This API is used to modify metric match rules between apm Business System and Prometheus Instance.
     * @param req ModifyApmPrometheusRuleRequest
     * @return ModifyApmPrometheusRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmPrometheusRuleResponse ModifyApmPrometheusRule(ModifyApmPrometheusRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmPrometheusRule", ModifyApmPrometheusRuleResponse.class);
    }

    /**
     *Modify sampling configurations
     * @param req ModifyApmSampleConfigRequest
     * @return ModifyApmSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmSampleConfigResponse ModifyApmSampleConfig(ModifyApmSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmSampleConfig", ModifyApmSampleConfigResponse.class);
    }

    /**
     *OpenAPI available for external use. Customers can flexibly specify the fields to be modified, and then add the list of services to be modified.
     * @param req ModifyGeneralApmApplicationConfigRequest
     * @return ModifyGeneralApmApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGeneralApmApplicationConfigResponse ModifyGeneralApmApplicationConfig(ModifyGeneralApmApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGeneralApmApplicationConfig", ModifyGeneralApmApplicationConfigResponse.class);
    }

    /**
     *Termination of APM business system.
     * @param req TerminateApmInstanceRequest
     * @return TerminateApmInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateApmInstanceResponse TerminateApmInstance(TerminateApmInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateApmInstance", TerminateApmInstanceResponse.class);
    }

}
