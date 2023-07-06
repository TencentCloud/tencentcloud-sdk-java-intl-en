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
package com.tencentcloudapi.tat.v20201028;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tat.v20201028.models.*;

public class TatClient extends AbstractClient{
    private static String endpoint = "tat.tencentcloudapi.com";
    private static String service = "tat";
    private static String version = "2020-10-28";
    
    public TatClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TatClient(Credential credential, String region, ClientProfile profile) {
        super(TatClient.endpoint, TatClient.version, credential, region, profile);
    }

    /**
     *This API is used to cancel the command executed on one or more CVM instances.

* If the command has not been delivered to the TAT agent, the task status is `PENDING`, `DELIVERING`, or `DELIVER_DELAYED`, and will be `CANCELLED` after the command is canceled.
* If the command has been delivered to the TAT agent, the task status is `RUNNING`, and will be `TERMINATED` after the command is canceled.
     * @param req CancelInvocationRequest
     * @return CancelInvocationResponse
     * @throws TencentCloudSDKException
     */
    public CancelInvocationResponse CancelInvocation(CancelInvocationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelInvocationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelInvocationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelInvocation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a command.
     * @param req CreateCommandRequest
     * @return CreateCommandResponse
     * @throws TencentCloudSDKException
     */
    public CreateCommandResponse CreateCommand(CreateCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an invoker.
     * @param req CreateInvokerRequest
     * @return CreateInvokerResponse
     * @throws TencentCloudSDKException
     */
    public CreateInvokerResponse CreateInvoker(CreateInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInvokerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a command.
Commands bound to an invoker cannot be deleted.
     * @param req DeleteCommandRequest
     * @return DeleteCommandResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCommandResponse DeleteCommand(DeleteCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an invoker.
     * @param req DeleteInvokerRequest
     * @return DeleteInvokerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInvokerResponse DeleteInvoker(DeleteInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInvokerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status of the TAT agent.
     * @param req DescribeAutomationAgentStatusRequest
     * @return DescribeAutomationAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutomationAgentStatusResponse DescribeAutomationAgentStatus(DescribeAutomationAgentStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutomationAgentStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutomationAgentStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutomationAgentStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query command details.
     * @param req DescribeCommandsRequest
     * @return DescribeCommandsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCommandsResponse DescribeCommands(DescribeCommandsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCommandsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCommandsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCommands");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query execution task details.
     * @param req DescribeInvocationTasksRequest
     * @return DescribeInvocationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationTasksResponse DescribeInvocationTasks(DescribeInvocationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query execution activity details.
     * @param req DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationsResponse DescribeInvocations(DescribeInvocationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the execution history of an invoker.
     * @param req DescribeInvokerRecordsRequest
     * @return DescribeInvokerRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvokerRecordsResponse DescribeInvokerRecords(DescribeInvokerRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvokerRecordsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvokerRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvokerRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query invoker details.
     * @param req DescribeInvokersRequest
     * @return DescribeInvokersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvokersResponse DescribeInvokers(DescribeInvokersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvokersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvokersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvokers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of regions that supports TAT.
If the `RegionState` is `AVAILABLE`, it means that TAT is available in the region. If no value is returned, TAT is not available in the region.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable an invoker.
     * @param req DisableInvokerRequest
     * @return DisableInvokerResponse
     * @throws TencentCloudSDKException
     */
    public DisableInvokerResponse DisableInvoker(DisableInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableInvokerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DisableInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable an invoker.
     * @param req EnableInvokerRequest
     * @return EnableInvokerResponse
     * @throws TencentCloudSDKException
     */
    public EnableInvokerResponse EnableInvoker(EnableInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableInvokerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EnableInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to trigger a command on the specified instance and returns the execution activity ID (inv-xxxxxxxx) on success. Each execution activity has one or more execution tasks (invt-xxxxxxxx) and each execution task indicates an execution record on a CVM or Lighthouse instance.

* If the agent is not installed on the instance or is offline, an error is returned.
* If the command type is not supported by the agent runtime environment, an error is returned.
* The specified instance needs to be in a VPC network.
* The specified instance needs to be in the RUNNING status.
* Only one type of instances (CVM or Lighthouse) can be specified in a single request.
     * @param req InvokeCommandRequest
     * @return InvokeCommandResponse
     * @throws TencentCloudSDKException
     */
    public InvokeCommandResponse InvokeCommand(InvokeCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvokeCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InvokeCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a command.
     * @param req ModifyCommandRequest
     * @return ModifyCommandResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCommandResponse ModifyCommand(ModifyCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an invoker.
     * @param req ModifyInvokerRequest
     * @return ModifyInvokerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInvokerResponse ModifyInvoker(ModifyInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInvokerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to preview the command with custom parameters. The command is not executed.
     * @param req PreviewReplacedCommandContentRequest
     * @return PreviewReplacedCommandContentResponse
     * @throws TencentCloudSDKException
     */
    public PreviewReplacedCommandContentResponse PreviewReplacedCommandContent(PreviewReplacedCommandContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PreviewReplacedCommandContentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<PreviewReplacedCommandContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PreviewReplacedCommandContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to execute a command and returns the execution activity ID (inv-xxxxxxxx) on success. Each execution has one or more execution tasks (invt-xxxxxxxx) and each execution task indicates an execution record on a CVM or Lighthouse instance.

* If the agent is not installed on the instance or is offline, an error is returned.
* If the command type is not supported by the agent runtime environment, an error is returned.
* The specified instance needs to be in a VPC network.
* The specified instance needs to be in the `RUNNING` status.
* Only one type of instances (CVM or Lighthouse) can be specified in a single request.
     * @param req RunCommandRequest
     * @return RunCommandResponse
     * @throws TencentCloudSDKException
     */
    public RunCommandResponse RunCommand(RunCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
