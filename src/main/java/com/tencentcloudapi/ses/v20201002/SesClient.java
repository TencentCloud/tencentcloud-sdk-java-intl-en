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
package com.tencentcloudapi.ses.v20201002;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ses.v20201002.models.*;

public class SesClient extends AbstractClient{
    private static String endpoint = "ses.tencentcloudapi.com";
    private static String service = "ses";
    private static String version = "2020-10-02";

    public SesClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SesClient(Credential credential, String region, ClientProfile profile) {
        super(SesClient.endpoint, SesClient.version, credential, region, profile);
    }

    /**
     *This API is used to send a TEXT or HTML email to multiple recipients at a time for marketing or notification purposes. By default, you can send emails using a template only. To send custom content, please contact your sales rep to enable this feature. You need to create a recipient group with email addresses first and then send emails by group ID. SES supports scheduled and recurring email sending tasks. You need to pass in `TimedParam` for a scheduled task and `CycleParam` for a recurring one.
     * @param req BatchSendEmailRequest
     * @return BatchSendEmailResponse
     * @throws TencentCloudSDKException
     */
    public BatchSendEmailResponse BatchSendEmail(BatchSendEmailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchSendEmailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchSendEmailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchSendEmail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *After the sender domain is verified, you need a sender address to send emails. For example, if your sender domain is mail.qcloud.com, your sender address can be service@mail.qcloud.com. If you want to display your name (such as "Tencent Cloud") in the inbox list of the recipients, the sender address should be in the format of `Tencent Cloud <email address>`. Please note that there must be a space between your name and the first angle bracket.
     * @param req CreateEmailAddressRequest
     * @return CreateEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailAddressResponse CreateEmailAddress(CreateEmailAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmailAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEmailAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEmailAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a sender domain. Before you can send an email using Tencent Cloud SES, you must create a sender domain as your identity. It can be the domain of your website or mobile app. You must verify the domain to prove that you own it and authorize Tencent Cloud SES to use it to send emails.
     * @param req CreateEmailIdentityRequest
     * @return CreateEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailIdentityResponse CreateEmailIdentity(CreateEmailIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmailIdentityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEmailIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEmailIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a TEXT or HTML email template. To create an HTML template, ensure that it does not include external CSS files. You can use {{variable name}} to specify a variable in the template.
Note: only an approved template can be used to send emails.
     * @param req CreateEmailTemplateRequest
     * @return CreateEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailTemplateResponse CreateEmailTemplate(CreateEmailTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmailTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEmailTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEmailTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unblocklist email addresses. If you confirm that a blocklisted recipient address is valid and active, you can remove it from Tencent Cloud’s address blocklist database.
     * @param req DeleteBlackListRequest
     * @return DeleteBlackListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlackListResponse DeleteBlackList(DeleteBlackListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBlackListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBlackListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBlackList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a sender address.
     * @param req DeleteEmailAddressRequest
     * @return DeleteEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailAddressResponse DeleteEmailAddress(DeleteEmailAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEmailAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEmailAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEmailAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a sender domain. After deleted, the sender domain can no longer be used to send emails.
     * @param req DeleteEmailIdentityRequest
     * @return DeleteEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailIdentityResponse DeleteEmailIdentity(DeleteEmailIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEmailIdentityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEmailIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEmailIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an email template.
     * @param req DeleteEmailTemplateRequest
     * @return DeleteEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailTemplateResponse DeleteEmailTemplate(DeleteEmailTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEmailTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEmailTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEmailTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the configuration details of a sender domain.
     * @param req GetEmailIdentityRequest
     * @return GetEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public GetEmailIdentityResponse GetEmailIdentity(GetEmailIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetEmailIdentityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetEmailIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetEmailIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the details of a template.
     * @param req GetEmailTemplateRequest
     * @return GetEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public GetEmailTemplateResponse GetEmailTemplate(GetEmailTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetEmailTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetEmailTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetEmailTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get email sending status. Only data within 90 days can be queried.
     * @param req GetSendEmailStatusRequest
     * @return GetSendEmailStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetSendEmailStatusResponse GetSendEmailStatus(GetSendEmailStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSendEmailStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSendEmailStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSendEmailStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the email sending statistics over a recent period, including data on sent emails, delivery success rate, open rate, bounce rate, and so on.
     * @param req GetStatisticsReportRequest
     * @return GetStatisticsReportResponse
     * @throws TencentCloudSDKException
     */
    public GetStatisticsReportResponse GetStatisticsReport(GetStatisticsReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetStatisticsReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetStatisticsReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetStatisticsReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *The API is used to get blocklisted addresses. In the case of a hard bounce, Tencent Cloud will blocklist the recipient address and do not allow any user to send emails to this address. If you confirm that this is a misjudgment, you can remove it from the blocklist.
     * @param req ListBlackEmailAddressRequest
     * @return ListBlackEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public ListBlackEmailAddressResponse ListBlackEmailAddress(ListBlackEmailAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListBlackEmailAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListBlackEmailAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListBlackEmailAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of sender addresses.
     * @param req ListEmailAddressRequest
     * @return ListEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailAddressResponse ListEmailAddress(ListEmailAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEmailAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListEmailAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListEmailAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of sender domains, including verified and unverified domains.
     * @param req ListEmailIdentitiesRequest
     * @return ListEmailIdentitiesResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailIdentitiesResponse ListEmailIdentities(ListEmailIdentitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEmailIdentitiesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListEmailIdentitiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListEmailIdentities");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of email templates.
     * @param req ListEmailTemplatesRequest
     * @return ListEmailTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailTemplatesResponse ListEmailTemplates(ListEmailTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEmailTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListEmailTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListEmailTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to send a TEXT or HTML email triggered for authentication or transaction. By default, you can send emails using a template only. To send custom content, please contact your sales rep to enable this feature.
     * @param req SendEmailRequest
     * @return SendEmailResponse
     * @throws TencentCloudSDKException
     */
    public SendEmailResponse SendEmail(SendEmailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendEmailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendEmailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendEmail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify whether your DNS configuration is correct.
     * @param req UpdateEmailIdentityRequest
     * @return UpdateEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEmailIdentityResponse UpdateEmailIdentity(UpdateEmailIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateEmailIdentityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateEmailIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateEmailIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update an email template. An updated template must be approved again before it can be used.
     * @param req UpdateEmailTemplateRequest
     * @return UpdateEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEmailTemplateResponse UpdateEmailTemplate(UpdateEmailTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateEmailTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateEmailTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateEmailTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
