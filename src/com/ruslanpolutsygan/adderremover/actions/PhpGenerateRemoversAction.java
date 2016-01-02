package com.ruslanpolutsygan.adderremover.actions;

import com.intellij.codeInsight.CodeInsightActionHandler;
import com.intellij.codeInsight.actions.CodeInsightAction;
import com.ruslanpolutsygan.adderremover.handler.ActionHandler;
import com.ruslanpolutsygan.adderremover.handler.checkers.RemoverChecker;
import com.ruslanpolutsygan.adderremover.handler.generators.RemoverGenerator;
import org.jetbrains.annotations.NotNull;


public class PhpGenerateRemoversAction extends CodeInsightAction {

    @NotNull
    @Override
    protected CodeInsightActionHandler getHandler() {
        return new ActionHandler(
                new RemoverGenerator(),
                new RemoverChecker()
        );
    }
}