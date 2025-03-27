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
package com.tencentcloudapi.cfg.v20210820;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cfg.v20210820.models.*;

public class CfgClient extends AbstractClient{
    private static String endpoint = "cfg.intl.tencentcloudapi.com";
    private static String service = "cfg";
    private static String version = "2021-08-20";
    
    public CfgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CfgClient(Credential credential, String region, ClientProfile profile) {
        super(CfgClient.endpoint, CfgClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an experiment with an action.
     * @param req CreateTaskFromActionRequest
     * @return CreateTaskFromActionResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFromActionResponse CreateTaskFromAction(CreateTaskFromActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFromAction", CreateTaskFromActionResponse.class);
    }

    /**
     *This API is used to create an experiment using a template.
     * @param req CreateTaskFromTemplateRequest
     * @return CreateTaskFromTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFromTemplateResponse CreateTaskFromTemplate(CreateTaskFromTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFromTemplate", CreateTaskFromTemplateResponse.class);
    }

    /**
     *This API is used to delete a task.
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTask", DeleteTaskResponse.class);
    }

    /**
     *This API is used to obtain the dynamic configuration parameters of the action field based on action ID, including action-specific parameters and common parameters.
     * @param req DescribeActionFieldConfigListRequest
     * @return DescribeActionFieldConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActionFieldConfigListResponse DescribeActionFieldConfigList(DescribeActionFieldConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActionFieldConfigList", DescribeActionFieldConfigListResponse.class);
    }

    /**
     *This API is used to obtain the action list of Chaotic Fault Generator.
     * @param req DescribeActionLibraryListRequest
     * @return DescribeActionLibraryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActionLibraryListResponse DescribeActionLibraryList(DescribeActionLibraryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActionLibraryList", DescribeActionLibraryListResponse.class);
    }

    /**
     *This API is used to query the object type list.
     * @param req DescribeObjectTypeListRequest
     * @return DescribeObjectTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeObjectTypeListResponse DescribeObjectTypeList(DescribeObjectTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeObjectTypeList", DescribeObjectTypeListResponse.class);
    }

    /**
     *This API is used to query a task.
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTask", DescribeTaskResponse.class);
    }

    /**
     *This API is used to obtain all logs generated during an experiment.
     * @param req DescribeTaskExecuteLogsRequest
     * @return DescribeTaskExecuteLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskExecuteLogsResponse DescribeTaskExecuteLogs(DescribeTaskExecuteLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskExecuteLogs", DescribeTaskExecuteLogsResponse.class);
    }

    /**
     *This API is used to query the task list.
     * @param req DescribeTaskListRequest
     * @return DescribeTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListResponse DescribeTaskList(DescribeTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskList", DescribeTaskListResponse.class);
    }

    /**
     *This API is used to obtain the guardrail triggering logs.
     * @param req DescribeTaskPolicyTriggerLogRequest
     * @return DescribeTaskPolicyTriggerLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskPolicyTriggerLogResponse DescribeTaskPolicyTriggerLog(DescribeTaskPolicyTriggerLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskPolicyTriggerLog", DescribeTaskPolicyTriggerLogResponse.class);
    }

    /**
     *This API is used to query a template library.
     * @param req DescribeTemplateRequest
     * @return DescribeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateResponse DescribeTemplate(DescribeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplate", DescribeTemplateResponse.class);
    }

    /**
     *This API is used to query the template list.
     * @param req DescribeTemplateListRequest
     * @return DescribeTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateListResponse DescribeTemplateList(DescribeTemplateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplateList", DescribeTemplateListResponse.class);
    }

    /**
     *This API is used to run a task.
     * @param req ExecuteTaskRequest
     * @return ExecuteTaskResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskResponse ExecuteTask(ExecuteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteTask", ExecuteTaskResponse.class);
    }

    /**
     *This API is used to trigger the action of the chaos engineering experiment and perform an experiment on the instance.
     * @param req ExecuteTaskInstanceRequest
     * @return ExecuteTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskInstanceResponse ExecuteTaskInstance(ExecuteTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteTaskInstance", ExecuteTaskInstanceResponse.class);
    }

    /**
     *This API is used to change the task running status.
     * @param req ModifyTaskRunStatusRequest
     * @return ModifyTaskRunStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskRunStatusResponse ModifyTaskRunStatus(ModifyTaskRunStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskRunStatus", ModifyTaskRunStatusResponse.class);
    }

    /**
     *This API is used to trigger the chaos engineering experiment guardrail (two types: trigger and recovery).
     * @param req TriggerPolicyRequest
     * @return TriggerPolicyResponse
     * @throws TencentCloudSDKException
     */
    public TriggerPolicyResponse TriggerPolicy(TriggerPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerPolicy", TriggerPolicyResponse.class);
    }

}
