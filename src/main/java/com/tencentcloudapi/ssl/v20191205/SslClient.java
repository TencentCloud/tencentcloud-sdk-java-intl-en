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
package com.tencentcloudapi.ssl.v20191205;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ssl.v20191205.models.*;

public class SslClient extends AbstractClient{
    private static String endpoint = "ssl.tencentcloudapi.com";
    private static String service = "ssl";
    private static String version = "2019-12-05";
    
    public SslClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SslClient(Credential credential, String region, ClientProfile profile) {
        super(SslClient.endpoint, SslClient.version, credential, region, profile);
    }

    /**
     *This API is used to apply for a free certificate.
     * @param req ApplyCertificateRequest
     * @return ApplyCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ApplyCertificateResponse ApplyCertificate(ApplyCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyCertificate", ApplyCertificateResponse.class);
    }

    /**
     *This API is used to batch delete CSRs.
     * @param req BatchDeleteCSRRequest
     * @return BatchDeleteCSRResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteCSRResponse BatchDeleteCSR(BatchDeleteCSRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteCSR", BatchDeleteCSRResponse.class);
    }

    /**
     *This API is used to cancel certificate review.
     * @param req CancelAuditCertificateRequest
     * @return CancelAuditCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CancelAuditCertificateResponse CancelAuditCertificate(CancelAuditCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelAuditCertificate", CancelAuditCertificateResponse.class);
    }

    /**
     *This API is used to cancel a certificate order.
     * @param req CancelCertificateOrderRequest
     * @return CancelCertificateOrderResponse
     * @throws TencentCloudSDKException
     */
    public CancelCertificateOrderResponse CancelCertificateOrder(CancelCertificateOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelCertificateOrder", CancelCertificateOrderResponse.class);
    }

    /**
     *This API is used to submit a certificate order.
     * @param req CommitCertificateInformationRequest
     * @return CommitCertificateInformationResponse
     * @throws TencentCloudSDKException
     */
    public CommitCertificateInformationResponse CommitCertificateInformation(CommitCertificateInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitCertificateInformation", CommitCertificateInformationResponse.class);
    }

    /**
     *This API is used to create a CSR.
     * @param req CreateCSRRequest
     * @return CreateCSRResponse
     * @throws TencentCloudSDKException
     */
    public CreateCSRResponse CreateCSR(CreateCSRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCSR", CreateCSRResponse.class);
    }

    /**
     *This API is used to purchase a certificate.
     * @param req CreateCertificateRequest
     * @return CreateCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateResponse CreateCertificate(CreateCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCertificate", CreateCertificateResponse.class);
    }

    /**
     *This API is used to create an async task for querying the cloud resources associated with a certificate. If such a task already exists under the certificate ID, the ID of this task is returned as the result. The following types of cloud resources are supported: CLB, CDN, WAF, LIVE, VOD, DDOS, TKE, APIGATEWAY, TCB, and TEO (EDGEONE). You can query the result of this task using the `DescribeCertificateBindResourceTaskResult` API.
     * @param req CreateCertificateBindResourceSyncTaskRequest
     * @return CreateCertificateBindResourceSyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateBindResourceSyncTaskResponse CreateCertificateBindResourceSyncTask(CreateCertificateBindResourceSyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCertificateBindResourceSyncTask", CreateCertificateBindResourceSyncTaskResponse.class);
    }

    /**
     *This API is used to delete a certificate.
     * @param req DeleteCertificateRequest
     * @return DeleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCertificate", DeleteCertificateResponse.class);
    }

    /**
     *This API is used to query the details of a CSR.
     * @param req DescribeCSRRequest
     * @return DescribeCSRResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSRResponse DescribeCSR(DescribeCSRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSR", DescribeCSRResponse.class);
    }

    /**
     *This API is used to query the CSR list.
     * @param req DescribeCSRSetRequest
     * @return DescribeCSRSetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSRSetResponse DescribeCSRSet(DescribeCSRSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSRSet", DescribeCSRSetResponse.class);
    }

    /**
     *This API is used to get certificate information.
     * @param req DescribeCertificateRequest
     * @return DescribeCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateResponse DescribeCertificate(DescribeCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificate", DescribeCertificateResponse.class);
    }

    /**
     *This API is used to query the result of an async task created with `CreateCertificateBindResourceSyncTask` to query cloud resources associated with a certificate. The following types of cloud resources are supported: CLB, CDN, WAF, LIVE, VOD, DDOS, TKE, APIGATEWAY, TCB, and TEO (EDGEONE).
     * @param req DescribeCertificateBindResourceTaskDetailRequest
     * @return DescribeCertificateBindResourceTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateBindResourceTaskDetailResponse DescribeCertificateBindResourceTaskDetail(DescribeCertificateBindResourceTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateBindResourceTaskDetail", DescribeCertificateBindResourceTaskDetailResponse.class);
    }

    /**
     *This API is used to query the result of an async task created with `CreateCertificateBindResourceSyncTask` to query cloud resources associated with a certificate. The following types of cloud resources are supported: CLB, CDN, WAF, LIVE, VOD, DDOS, TKE, APIGATEWAY, TCB, and TEO (EDGEONE).
     * @param req DescribeCertificateBindResourceTaskResultRequest
     * @return DescribeCertificateBindResourceTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateBindResourceTaskResultResponse DescribeCertificateBindResourceTaskResult(DescribeCertificateBindResourceTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateBindResourceTaskResult", DescribeCertificateBindResourceTaskResultResponse.class);
    }

    /**
     *This API is used to get certificate details.
     * @param req DescribeCertificateDetailRequest
     * @return DescribeCertificateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateDetailResponse DescribeCertificateDetail(DescribeCertificateDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateDetail", DescribeCertificateDetailResponse.class);
    }

    /**
     *This API is used to get certificate operation logs in the current account.
     * @param req DescribeCertificateOperateLogsRequest
     * @return DescribeCertificateOperateLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateOperateLogsResponse DescribeCertificateOperateLogs(DescribeCertificateOperateLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateOperateLogs", DescribeCertificateOperateLogsResponse.class);
    }

    /**
     *This API is used to get the certificate list.
     * @param req DescribeCertificatesRequest
     * @return DescribeCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificatesResponse DescribeCertificates(DescribeCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificates", DescribeCertificatesResponse.class);
    }

    /**
     *This API is used to query the list of EDGEONE instances to which a certificate can be deployed.
     * @param req DescribeHostTeoInstanceListRequest
     * @return DescribeHostTeoInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostTeoInstanceListResponse DescribeHostTeoInstanceList(DescribeHostTeoInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostTeoInstanceList", DescribeHostTeoInstanceListResponse.class);
    }

    /**
     *This API is used to download a certificate.
     * @param req DownloadCertificateRequest
     * @return DownloadCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCertificateResponse DownloadCertificate(DownloadCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadCertificate", DownloadCertificateResponse.class);
    }

    /**
     *This API is used to modify the information of a CSR.
     * @param req ModifyCSRRequest
     * @return ModifyCSRResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSRResponse ModifyCSR(ModifyCSRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSR", ModifyCSRResponse.class);
    }

    /**
     *This API is used to modify a certificate alias by passing in the certificate ID and new alias.
     * @param req ModifyCertificateAliasRequest
     * @return ModifyCertificateAliasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAliasResponse ModifyCertificateAlias(ModifyCertificateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificateAlias", ModifyCertificateAliasResponse.class);
    }

    /**
     *This API is used to modify the projects of multiple certificates.
     * @param req ModifyCertificateProjectRequest
     * @return ModifyCertificateProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateProjectResponse ModifyCertificateProject(ModifyCertificateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificateProject", ModifyCertificateProjectResponse.class);
    }

    /**
     *This API is used to re-submit a review application for a paid certificate whose review failed or was canceled.
     * @param req ModifyCertificateResubmitRequest
     * @return ModifyCertificateResubmitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateResubmitResponse ModifyCertificateResubmit(ModifyCertificateResubmitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificateResubmit", ModifyCertificateResubmitResponse.class);
    }

    /**
     *This API is used to reissue a certificate. Note that if you have applied for a free certificate, only an RSA-2048 certificate will be reissued, and the certificate can be reissued only once.
     * @param req ReplaceCertificateRequest
     * @return ReplaceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceCertificateResponse ReplaceCertificate(ReplaceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceCertificate", ReplaceCertificateResponse.class);
    }

    /**
     *This API is used to submit certificate information.
     * @param req SubmitCertificateInformationRequest
     * @return SubmitCertificateInformationResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCertificateInformationResponse SubmitCertificateInformation(SubmitCertificateInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitCertificateInformation", SubmitCertificateInformationResponse.class);
    }

    /**
     *This API is used to upload a certificate.
     * @param req UploadCertificateRequest
     * @return UploadCertificateResponse
     * @throws TencentCloudSDKException
     */
    public UploadCertificateResponse UploadCertificate(UploadCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadCertificate", UploadCertificateResponse.class);
    }

    /**
     *This API is used to upload the confirmation letter for a certificate.
     * @param req UploadConfirmLetterRequest
     * @return UploadConfirmLetterResponse
     * @throws TencentCloudSDKException
     */
    public UploadConfirmLetterResponse UploadConfirmLetter(UploadConfirmLetterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadConfirmLetter", UploadConfirmLetterResponse.class);
    }

}
