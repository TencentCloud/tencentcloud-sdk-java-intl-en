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
package com.tencentcloudapi.hunyuan.v20230901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.hunyuan.v20230901.models.*;

public class HunyuanClient extends AbstractClient{
    private static String endpoint = "hunyuan.intl.tencentcloudapi.com";
    private static String service = "hunyuan";
    private static String version = "2023-09-01";

    public HunyuanClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HunyuanClient(Credential credential, String region, ClientProfile profile) {
        super(HunyuanClient.endpoint, HunyuanClient.version, credential, region, profile);
    }

    /**
     *This API is used to intelligently generate 3D content based on the HunYuan Large Model and input text descriptions/images.
This API is used to provide 3 concurrent tasks by default, which can process 3 submitted tasks simultaneously. The next task can be processed only after the previous task is completed.
     * @param req QueryHunyuanTo3DProJobRequest
     * @return QueryHunyuanTo3DProJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanTo3DProJobResponse QueryHunyuanTo3DProJob(QueryHunyuanTo3DProJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanTo3DProJob", QueryHunyuanTo3DProJobResponse.class);
    }

    /**
     *This API is used to intelligently generate 3D content based on the HunYuan Large Model and input text descriptions/images.
This API is used to provide 3 concurrent tasks by default. Up to 3 submitted tasks can be processed simultaneously. A new task can be processed only after the previous one is completed.
     * @param req SubmitHunyuanTo3DProJobRequest
     * @return SubmitHunyuanTo3DProJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanTo3DProJobResponse SubmitHunyuanTo3DProJob(SubmitHunyuanTo3DProJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanTo3DProJob", SubmitHunyuanTo3DProJobResponse.class);
    }

}
