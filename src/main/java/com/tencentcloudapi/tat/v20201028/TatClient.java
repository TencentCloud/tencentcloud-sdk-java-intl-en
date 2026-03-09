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
    private static String endpoint = "tat.intl.tencentcloudapi.com";
    private static String service = "tat";
    private static String version = "2020-10-28";

    public TatClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TatClient(Credential credential, String region, ClientProfile profile) {
        super(TatClient.endpoint, TatClient.version, credential, region, profile);
    }

    /**
     *Cancel the executed command on one or multiple instances.

* If the command is not delivered to the agent and the task status is in PENDING, DELIVERING, or DELIVER_DELAYED, the state of a task is CANCELLED after cancellation.
* If the command is sent to the agent and the task status is RUNNING, the task status is TERMINATED after cancellation.
     * @param req CancelInvocationRequest
     * @return CancelInvocationResponse
     * @throws TencentCloudSDKException
     */
    public CancelInvocationResponse CancelInvocation(CancelInvocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelInvocation", CancelInvocationResponse.class);
    }

    /**
     *This API is used to create a command.
     * @param req CreateCommandRequest
     * @return CreateCommandResponse
     * @throws TencentCloudSDKException
     */
    public CreateCommandResponse CreateCommand(CreateCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCommand", CreateCommandResponse.class);
    }

    /**
     *This API is used to create an invoker.
     * @param req CreateInvokerRequest
     * @return CreateInvokerResponse
     * @throws TencentCloudSDKException
     */
    public CreateInvokerResponse CreateInvoker(CreateInvokerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInvoker", CreateInvokerResponse.class);
    }

    /**
     *This API is used to create a registration code.
     * @param req CreateRegisterCodeRequest
     * @return CreateRegisterCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateRegisterCodeResponse CreateRegisterCode(CreateRegisterCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRegisterCode", CreateRegisterCodeResponse.class);
    }

    /**
     *This API is used to delete a command.
Commands bound to an invoker cannot be deleted.
     * @param req DeleteCommandRequest
     * @return DeleteCommandResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCommandResponse DeleteCommand(DeleteCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCommand", DeleteCommandResponse.class);
    }

    /**
     *This API is used to execute batch deletion commands.
     * @param req DeleteCommandsRequest
     * @return DeleteCommandsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCommandsResponse DeleteCommands(DeleteCommandsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCommands", DeleteCommandsResponse.class);
    }

    /**
     *This API is used to delete an invoker.
     * @param req DeleteInvokerRequest
     * @return DeleteInvokerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInvokerResponse DeleteInvoker(DeleteInvokerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInvoker", DeleteInvokerResponse.class);
    }

    /**
     *This API is used to delete registration codes in batches.
     * @param req DeleteRegisterCodesRequest
     * @return DeleteRegisterCodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRegisterCodesResponse DeleteRegisterCodes(DeleteRegisterCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRegisterCodes", DeleteRegisterCodesResponse.class);
    }

    /**
     *This API is used to delete managed instances.
     * @param req DeleteRegisterInstanceRequest
     * @return DeleteRegisterInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRegisterInstanceResponse DeleteRegisterInstance(DeleteRegisterInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRegisterInstance", DeleteRegisterInstanceResponse.class);
    }

    /**
     *This API is used to query the status of the TAT agent.
     * @param req DescribeAutomationAgentStatusRequest
     * @return DescribeAutomationAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutomationAgentStatusResponse DescribeAutomationAgentStatus(DescribeAutomationAgentStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutomationAgentStatus", DescribeAutomationAgentStatusResponse.class);
    }

    /**
     *This API is used to query command details.
     * @param req DescribeCommandsRequest
     * @return DescribeCommandsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCommandsResponse DescribeCommands(DescribeCommandsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCommands", DescribeCommandsResponse.class);
    }

    /**
     *This API is used to query execution task details.
     * @param req DescribeInvocationTasksRequest
     * @return DescribeInvocationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationTasksResponse DescribeInvocationTasks(DescribeInvocationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvocationTasks", DescribeInvocationTasksResponse.class);
    }

    /**
     *This API is used to query execution activity details.
     * @param req DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationsResponse DescribeInvocations(DescribeInvocationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvocations", DescribeInvocationsResponse.class);
    }

    /**
     *This API is used to query the execution history of an invoker.
     * @param req DescribeInvokerRecordsRequest
     * @return DescribeInvokerRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvokerRecordsResponse DescribeInvokerRecords(DescribeInvokerRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvokerRecords", DescribeInvokerRecordsResponse.class);
    }

    /**
     *This API is used to query invoker details.
     * @param req DescribeInvokersRequest
     * @return DescribeInvokersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvokersResponse DescribeInvokers(DescribeInvokersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvokers", DescribeInvokersResponse.class);
    }

    /**
     *This API is used to obtain quota information.
     * @param req DescribeQuotasRequest
     * @return DescribeQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotasResponse DescribeQuotas(DescribeQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuotas", DescribeQuotasResponse.class);
    }

    /**
     *This API is used to query the list of regions that supports TAT.
If the `RegionState` is `AVAILABLE`, it means that TAT is available in the region. If no value is returned, TAT is not available in the region.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This API is used to query registration code info.
     * @param req DescribeRegisterCodesRequest
     * @return DescribeRegisterCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegisterCodesResponse DescribeRegisterCodes(DescribeRegisterCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegisterCodes", DescribeRegisterCodesResponse.class);
    }

    /**
     *This API is used to query managed instance information.
     * @param req DescribeRegisterInstancesRequest
     * @return DescribeRegisterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegisterInstancesResponse DescribeRegisterInstances(DescribeRegisterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegisterInstances", DescribeRegisterInstancesResponse.class);
    }

    /**
     *This API is used to query scenario details.
     * @param req DescribeScenesRequest
     * @return DescribeScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenesResponse DescribeScenes(DescribeScenesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenes", DescribeScenesResponse.class);
    }

    /**
     *This API is used to disable an invoker.
     * @param req DisableInvokerRequest
     * @return DisableInvokerResponse
     * @throws TencentCloudSDKException
     */
    public DisableInvokerResponse DisableInvoker(DisableInvokerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableInvoker", DisableInvokerResponse.class);
    }

    /**
     *This API is used to bulk disable registration codes.
     * @param req DisableRegisterCodesRequest
     * @return DisableRegisterCodesResponse
     * @throws TencentCloudSDKException
     */
    public DisableRegisterCodesResponse DisableRegisterCodes(DisableRegisterCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableRegisterCodes", DisableRegisterCodesResponse.class);
    }

    /**
     *This API is used to enable an invoker.
     * @param req EnableInvokerRequest
     * @return EnableInvokerResponse
     * @throws TencentCloudSDKException
     */
    public EnableInvokerResponse EnableInvoker(EnableInvokerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableInvoker", EnableInvokerResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeCommand", InvokeCommandResponse.class);
    }

    /**
     *This API is used to modify a command.
     * @param req ModifyCommandRequest
     * @return ModifyCommandResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCommandResponse ModifyCommand(ModifyCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCommand", ModifyCommandResponse.class);
    }

    /**
     *This API is used to modify an invoker.
     * @param req ModifyInvokerRequest
     * @return ModifyInvokerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInvokerResponse ModifyInvoker(ModifyInvokerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInvoker", ModifyInvokerResponse.class);
    }

    /**
     *This API is used to modify managed instance information.
     * @param req ModifyRegisterInstanceRequest
     * @return ModifyRegisterInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRegisterInstanceResponse ModifyRegisterInstance(ModifyRegisterInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRegisterInstance", ModifyRegisterInstanceResponse.class);
    }

    /**
     *This API is used to preview the command with custom parameters. The command is not executed.
     * @param req PreviewReplacedCommandContentRequest
     * @return PreviewReplacedCommandContentResponse
     * @throws TencentCloudSDKException
     */
    public PreviewReplacedCommandContentResponse PreviewReplacedCommandContent(PreviewReplacedCommandContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PreviewReplacedCommandContent", PreviewReplacedCommandContentResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "RunCommand", RunCommandResponse.class);
    }

}
