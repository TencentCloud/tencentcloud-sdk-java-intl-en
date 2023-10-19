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
     *This API is used to send a TEXT or HTML email to multiple recipients at a time for marketing or notification purposes. By default, you can send emails using a template only. You need to create a recipient group with email addresses first and then send emails by group ID. SES supports scheduled and recurring email sending tasks. You need to pass in `TimedParam` for a scheduled task and `CycleParam` for a recurring one.
     * @param req BatchSendEmailRequest
     * @return BatchSendEmailResponse
     * @throws TencentCloudSDKException
     */
    public BatchSendEmailResponse BatchSendEmail(BatchSendEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchSendEmail", BatchSendEmailResponse.class);
    }

    /**
     *After the sender domain is verified, you need a sender address to send emails. For example, if your sender domain is mail.qcloud.com, your sender address can be service@mail.qcloud.com. If you want to display your name (such as "Tencent Cloud") in the inbox list of the recipients, the sender address should be in the format of `Tencent Cloud <email address>`. Please note that there must be a space between your name and the first angle bracket.
     * @param req CreateEmailAddressRequest
     * @return CreateEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailAddressResponse CreateEmailAddress(CreateEmailAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmailAddress", CreateEmailAddressResponse.class);
    }

    /**
     *This API is used to create a sender domain. Before you can send an email using Tencent Cloud SES, you must create a sender domain as your identity. It can be the domain of your website or mobile app. You must verify the domain to prove that you own it and authorize Tencent Cloud SES to use it to send emails.
     * @param req CreateEmailIdentityRequest
     * @return CreateEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailIdentityResponse CreateEmailIdentity(CreateEmailIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmailIdentity", CreateEmailIdentityResponse.class);
    }

    /**
     *This API is used to create a TEXT or HTML email template. To create an HTML template, ensure that it does not include external CSS files. You can use {{variable name}} to specify a variable in the template.
Note: Only an approved template can be used to send emails.
     * @param req CreateEmailTemplateRequest
     * @return CreateEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailTemplateResponse CreateEmailTemplate(CreateEmailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmailTemplate", CreateEmailTemplateResponse.class);
    }

    /**
     *This API is used to create a recipient group, which is the list of target email addresses for batch sending emails. After creating a group, you need to upload recipient email addresses. Then, you can create a sending task and select the group to batch send emails.
     * @param req CreateReceiverRequest
     * @return CreateReceiverResponse
     * @throws TencentCloudSDKException
     */
    public CreateReceiverResponse CreateReceiver(CreateReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReceiver", CreateReceiverResponse.class);
    }

    /**
     *This API is used to add recipient email addresses (up to 20,000 at a time) to a recipient group. This will be processed asynchronously. If the data volume is large, it may take some time to upload. You can check the recipient group for the upload status and upload quantity. This API has basically the same feature as that of `CreateReceiverDetailWithData` except that it doesn't support uploading template parameters for email sending. You need to first call the `CreateReceiver` API to create a recipient group, then call this API to pass in recipient addresses, and finally call the `BatchSendEmail` API to batch send emails. This API supports adding more recipient addresses during upload but not address deduplication, so you need to make sure that the recipient addresses are not duplicate by yourself. This API can request up to 20,000 recipient addresses at a time, but the recipient group can contain up to 50,000 addresses currently.
     * @param req CreateReceiverDetailRequest
     * @return CreateReceiverDetailResponse
     * @throws TencentCloudSDKException
     */
    public CreateReceiverDetailResponse CreateReceiverDetail(CreateReceiverDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReceiverDetail", CreateReceiverDetailResponse.class);
    }

    /**
     *This API is used to unblocklist email addresses. If you confirm that a blocklisted recipient address is valid and active, you can remove it from Tencent Cloud’s address blocklist database.
     * @param req DeleteBlackListRequest
     * @return DeleteBlackListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlackListResponse DeleteBlackList(DeleteBlackListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBlackList", DeleteBlackListResponse.class);
    }

    /**
     *This API is used to delete a sender address.
     * @param req DeleteEmailAddressRequest
     * @return DeleteEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailAddressResponse DeleteEmailAddress(DeleteEmailAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEmailAddress", DeleteEmailAddressResponse.class);
    }

    /**
     *This API is used to delete a sender domain. After deleted, the sender domain can no longer be used to send emails.
     * @param req DeleteEmailIdentityRequest
     * @return DeleteEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailIdentityResponse DeleteEmailIdentity(DeleteEmailIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEmailIdentity", DeleteEmailIdentityResponse.class);
    }

    /**
     *This API is used to delete an email template.
     * @param req DeleteEmailTemplateRequest
     * @return DeleteEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailTemplateResponse DeleteEmailTemplate(DeleteEmailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEmailTemplate", DeleteEmailTemplateResponse.class);
    }

    /**
     *This API is used to delete a recipient group and all recipient email addresses in the group based on the recipient group ID.
     * @param req DeleteReceiverRequest
     * @return DeleteReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReceiverResponse DeleteReceiver(DeleteReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReceiver", DeleteReceiverResponse.class);
    }

    /**
     *This API is used to get the configuration details of a sender domain.
     * @param req GetEmailIdentityRequest
     * @return GetEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public GetEmailIdentityResponse GetEmailIdentity(GetEmailIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetEmailIdentity", GetEmailIdentityResponse.class);
    }

    /**
     *This API is used to get the details of a template.
     * @param req GetEmailTemplateRequest
     * @return GetEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public GetEmailTemplateResponse GetEmailTemplate(GetEmailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetEmailTemplate", GetEmailTemplateResponse.class);
    }

    /**
     *This API is used to get email sending status. Only data within 30 days can be queried.
Default API request rate limit: 1 request/sec.
     * @param req GetSendEmailStatusRequest
     * @return GetSendEmailStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetSendEmailStatusResponse GetSendEmailStatus(GetSendEmailStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSendEmailStatus", GetSendEmailStatusResponse.class);
    }

    /**
     *This API is used to get the email sending statistics over a recent period, including data on sent emails, delivery success rate, open rate, bounce rate, and so on.
     * @param req GetStatisticsReportRequest
     * @return GetStatisticsReportResponse
     * @throws TencentCloudSDKException
     */
    public GetStatisticsReportResponse GetStatisticsReport(GetStatisticsReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetStatisticsReport", GetStatisticsReportResponse.class);
    }

    /**
     *The API is used to get blocklisted addresses. In the case of a hard bounce, Tencent Cloud will blocklist the recipient address and do not allow any user to send emails to this address. If you confirm that this is a misjudgment, you can remove it from the blocklist.
     * @param req ListBlackEmailAddressRequest
     * @return ListBlackEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public ListBlackEmailAddressResponse ListBlackEmailAddress(ListBlackEmailAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListBlackEmailAddress", ListBlackEmailAddressResponse.class);
    }

    /**
     *This API is used to get the list of sender addresses.
     * @param req ListEmailAddressRequest
     * @return ListEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailAddressResponse ListEmailAddress(ListEmailAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEmailAddress", ListEmailAddressResponse.class);
    }

    /**
     *This API is used to get the list of sender domains, including verified and unverified domains.
     * @param req ListEmailIdentitiesRequest
     * @return ListEmailIdentitiesResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailIdentitiesResponse ListEmailIdentities(ListEmailIdentitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEmailIdentities", ListEmailIdentitiesResponse.class);
    }

    /**
     *This API is used to get the list of email templates.
     * @param req ListEmailTemplatesRequest
     * @return ListEmailTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailTemplatesResponse ListEmailTemplates(ListEmailTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEmailTemplates", ListEmailTemplatesResponse.class);
    }

    /**
     *This API is used to query recipient groups. It supports pagination, fuzzy query, and query by status.
     * @param req ListReceiversRequest
     * @return ListReceiversResponse
     * @throws TencentCloudSDKException
     */
    public ListReceiversResponse ListReceivers(ListReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReceivers", ListReceiversResponse.class);
    }

    /**
     *This API is used to query batch email sending tasks (including immediate, scheduled, and recurring tasks) by page. You can query task data including the number of emails requested to be sent, the number of sent emails, the number of cached emails, and task status.
     * @param req ListSendTasksRequest
     * @return ListSendTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListSendTasksResponse ListSendTasks(ListSendTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSendTasks", ListSendTasksResponse.class);
    }

    /**
     *This API is used to send an HTML or TEXT email triggered for authentication or transaction. By default, you can send emails using a template only.
     * @param req SendEmailRequest
     * @return SendEmailResponse
     * @throws TencentCloudSDKException
     */
    public SendEmailResponse SendEmail(SendEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendEmail", SendEmailResponse.class);
    }

    /**
     *This API is used to verify whether your DNS configuration is correct.
     * @param req UpdateEmailIdentityRequest
     * @return UpdateEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEmailIdentityResponse UpdateEmailIdentity(UpdateEmailIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEmailIdentity", UpdateEmailIdentityResponse.class);
    }

    /**
     *This API is used to set the SMTP password. Initially, no SMTP password is set for your email address, so emails cannot be sent over SMTP. To send emails over SMTP, you must set the SMTP password. The set password can be changed subsequently.
     * @param req UpdateEmailSmtpPassWordRequest
     * @return UpdateEmailSmtpPassWordResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEmailSmtpPassWordResponse UpdateEmailSmtpPassWord(UpdateEmailSmtpPassWordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEmailSmtpPassWord", UpdateEmailSmtpPassWordResponse.class);
    }

    /**
     *This API is used to update an email template. An updated template must be approved again before it can be used.
     * @param req UpdateEmailTemplateRequest
     * @return UpdateEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEmailTemplateResponse UpdateEmailTemplate(UpdateEmailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEmailTemplate", UpdateEmailTemplateResponse.class);
    }

}
