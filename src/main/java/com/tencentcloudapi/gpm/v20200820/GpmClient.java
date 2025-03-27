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
package com.tencentcloudapi.gpm.v20200820;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gpm.v20200820.models.*;

public class GpmClient extends AbstractClient{
    private static String endpoint = "gpm.intl.tencentcloudapi.com";
    private static String service = "gpm";
    private static String version = "2020-08-20";
    
    public GpmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GpmClient(Credential credential, String region, ClientProfile profile) {
        super(GpmClient.endpoint, GpmClient.version, credential, region, profile);
    }

    /**
     *This API is used to cancel matching.
     * @param req CancelMatchingRequest
     * @return CancelMatchingResponse
     * @throws TencentCloudSDKException
     */
    public CancelMatchingResponse CancelMatching(CancelMatchingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelMatching", CancelMatchingResponse.class);
    }

    /**
     *This API is used to create a match.
     * @param req CreateMatchRequest
     * @return CreateMatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateMatchResponse CreateMatch(CreateMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMatch", CreateMatchResponse.class);
    }

    /**
     *This API is used to create a rule.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *This API is used to delete a match.
     * @param req DeleteMatchRequest
     * @return DeleteMatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMatchResponse DeleteMatch(DeleteMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMatch", DeleteMatchResponse.class);
    }

    /**
     *This API is used to delete a rule.
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *This API is used to view statistics.
     * @param req DescribeDataRequest
     * @return DescribeDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataResponse DescribeData(DescribeDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeData", DescribeDataResponse.class);
    }

    /**
     *This API is used to query the matchmaking details.
     * @param req DescribeMatchRequest
     * @return DescribeMatchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchResponse DescribeMatch(DescribeMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMatch", DescribeMatchResponse.class);
    }

    /**
     *This API is used to query the created MatchCodes and paginate the query result.
     * @param req DescribeMatchCodesRequest
     * @return DescribeMatchCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchCodesResponse DescribeMatchCodes(DescribeMatchCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMatchCodes", DescribeMatchCodesResponse.class);
    }

    /**
     *This API is used to query the matchmaking list and paginate the query result.
     * @param req DescribeMatchesRequest
     * @return DescribeMatchesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchesResponse DescribeMatches(DescribeMatchesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMatches", DescribeMatchesResponse.class);
    }

    /**
     *This API is used to query the matching progress.
     * @param req DescribeMatchingProgressRequest
     * @return DescribeMatchingProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchingProgressResponse DescribeMatchingProgress(DescribeMatchingProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMatchingProgress", DescribeMatchingProgressResponse.class);
    }

    /**
     *This API is used to query the rule details.
     * @param req DescribeRuleRequest
     * @return DescribeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleResponse DescribeRule(DescribeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRule", DescribeRuleResponse.class);
    }

    /**
     *This API is used to query the rule set list and paginate the query result.
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *This API is used to query the token of a Matchcode, which is used for verified the pushed message.
     * @param req DescribeTokenRequest
     * @return DescribeTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenResponse DescribeToken(DescribeTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeToken", DescribeTokenResponse.class);
    }

    /**
     *This API is used to modify a match.
     * @param req ModifyMatchRequest
     * @return ModifyMatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMatchResponse ModifyMatch(ModifyMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMatch", ModifyMatchResponse.class);
    }

    /**
     *This API is used to modify a rule (including description and tag).
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *This API is used to modify the token of a Matchcode.
     * @param req ModifyTokenRequest
     * @return ModifyTokenResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTokenResponse ModifyToken(ModifyTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyToken", ModifyTokenResponse.class);
    }

    /**
     *This API is used to pass in one player or multiple players to initiate match. Players within the same request will be assigned to the same game session.
     * @param req StartMatchingRequest
     * @return StartMatchingResponse
     * @throws TencentCloudSDKException
     */
    public StartMatchingResponse StartMatching(StartMatchingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMatching", StartMatchingResponse.class);
    }

    /**
     *This API is used to send a match backfill request, for which a MatchTicket will be searched to start a new match.
     * @param req StartMatchingBackfillRequest
     * @return StartMatchingBackfillResponse
     * @throws TencentCloudSDKException
     */
    public StartMatchingBackfillResponse StartMatchingBackfill(StartMatchingBackfillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMatchingBackfill", StartMatchingBackfillResponse.class);
    }

}
