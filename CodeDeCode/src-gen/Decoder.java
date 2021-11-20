// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Decoder.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Decoder {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object alf=null;
  public static Object alfE=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=7;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=8;
      Object decoder=$fix(Decoder.createDecoder());
      $line=14;
      Utilities.test($cast(gold.structures.automaton.IAutomaton.class,decoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"main",$line);
    }
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=19;
      alf=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet('z')));
      $line=20;
      alfE=$fix($opIntvlY('A','Z'));
      $line=21;
      Object E=$fix($opUnionY(alf,GCollections.asSet('#')));
      $line=22;
      Object A=$fix($opUnionY(alf,GCollections.asSet("")));
      $line=23;
      Object B=$fix($opCartsY(new Object[]{$opIntvlY(0,2),$opIntvlY(0,4)}));
      $line=24;
      Object C=$fix($opUnionY($opCartsY(new Object[]{E,B}),GCollections.asSet(GCollections.asList(':',GCollections.asList(0,0)))));
      $line=25;
      Object D=$fix($opCartsY(new Object[]{A,A}));
      $line=26;
      Object Q=$fix($opUnionY($opUnionY($opUnionY(D,$opCartsY(new Object[]{D,C})),GCollections.asSet('I',"err")),$opIntvlY('0','4')));
      $line=27;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY(alf,alfE),GCollections.asSet(':','#')),$opIntvlY('0','4')));
      $line=28;
      Object \u03A3_=$fix($opUnionY(alf,GCollections.asSet('$',':')));
      $line=29;
      Object q_0=$fix('I');
      $line=30;
      Object F=$fix($opIntvlY('0','4'));
      $line=32;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(Decoder.class,"\u03B4"),new GMethod(Decoder.class,"g"),new GMethod(Decoder.class,"h")});
      if (true) break $try;
      $line=33;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object A, Object n) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=36;
      if (($opEqualY(A,'I')&&!$opMembrY(n,alf))) {
        $line=37;
        $result="err";
        if (true) break $try;
      }
      else {
        $line=38;
        if ($opEqualY(A,'I')) {
          $line=39;
          $result=GCollections.asList(n,"");
          if (true) break $try;
        }
        else {
          $line=40;
          if (($opEqualY(A,"err")||$opMembrY(A,$opIntvlY('0','4')))) {
            $line=41;
            $result="err";
            if (true) break $try;
          }
        }
      }
      $line=43;
      $rethrow(new RuntimeException("The function \"\u03B4(A:Object,n:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object \u03B4(java.lang.Iterable $v1, Object n) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object A=$v2.next();
      Object B=$v2.next();
      $line=46;
      if ((($opEqualY(A,"")||$bool((!$opMembrY(A,alf)&&$bool(($opEqualY($getArrayValue(A,new Object[]{0}),"")||$opEqualY($getArrayValue(A,new Object[]{1}),""))))))||$bool(((!$opMembrY(B,alf)&&$opGreatY($opAbsolY(B),1))&&$bool(($opEqualY($getArrayValue(B,new Object[]{0}),"")||$opEqualY($getArrayValue(B,new Object[]{0}),'#'))))))) {
        $line=47;
        $result="err";
        if (true) break $try;
      }
      else {
        $line=48;
        if ($opMembrY(A,alf)) {
          $line=49;
          if (($opMembrY(B,alf)&&$opEqualY(n,':'))) {
            $line=50;
            $result=GCollections.asList(GCollections.asList(A,B),GCollections.asList(':',GCollections.asList(0,0)));
            if (true) break $try;
          }
          else {
            $line=51;
            if ((!$opMembrY(B,alf)&&$opMembrY(n,alf))) {
              $line=52;
              $result=GCollections.asList(A,n);
              if (true) break $try;
            }
            else {
              $line=54;
              $result="err";
              if (true) break $try;
            }
          }
        }
        else {
          $line=57;
          Object a=$fix($opModulY($opAdditY($getArrayValue(B,new Object[]{1,0}),1),3));
          $line=58;
          Object b=$fix($getArrayValue(B,new Object[]{1,1}));
          $line=59;
          if (($opMembrY(n,$opIntvlY('0','4'))&&$opEqualY($getArrayValue(B,new Object[]{0}),':'))) {
            $line=60;
            $result="err";
            if (true) break $try;
          }
          else {
            $line=61;
            if (($opMembrY(n,$opIntvlY('0','4'))&&$bool($opEqualY($opSubtrY(n,'0'),b)))) {
              $line=62;
              $result=n;
              if (true) break $try;
            }
            else {
              $line=63;
              if (($opEqualY(n,':')||$bool(($opEqualY($getArrayValue(B,new Object[]{0}),':')&&$opEqualY(n,'#'))))) {
                $line=64;
                $result="err";
                if (true) break $try;
              }
              else {
                $line=65;
                if (!$opMembrY(n,A)) {
                  $line=66;
                  if (($opEqualY(n,$getArrayValue(B,new Object[]{0}))&&!$opEqualY(n,'#'))) {
                    $line=67;
                    $result="err";
                    if (true) break $try;
                  }
                  else {
                    $line=68;
                    if (($opMembrY(n,alfE)&&$opEqualY(a,1))) {
                      $line=69;
                      $result=GCollections.asList(A,GCollections.asList(Decoder.previousToLower(n),GCollections.asList(a,b)));
                      if (true) break $try;
                    }
                    else {
                      $line=70;
                      if (($opMembrY(n,alfE)&&$opEqualY(a,2))) {
                        $line=71;
                        $result=GCollections.asList(A,GCollections.asList(Decoder.toLower(n),GCollections.asList(a,b)));
                        if (true) break $try;
                      }
                      else {
                        $line=72;
                        if (($bool(($opMembrY(n,alfE)&&$opEqualY(a,0)))||$opMembrY(n,$opIntvlY('0','4')))) {
                          $line=73;
                          $result="err";
                          if (true) break $try;
                        }
                        else {
                          $line=74;
                          if (($opEqualY(n,'#')&&$opMembrY($getArrayValue(B,new Object[]{0}),alfE))) {
                            $line=75;
                            $result="err";
                            if (true) break $try;
                          }
                          else {
                            $line=76;
                            if ($opEqualY(n,'#')) {
                              $line=77;
                              $result=GCollections.asList(A,GCollections.asList($getArrayValue(B,new Object[]{0}),GCollections.asList(a,b)));
                              if (true) break $try;
                            }
                            else {
                              $line=79;
                              $result=GCollections.asList(A,GCollections.asList(n,GCollections.asList(a,b)));
                              if (true) break $try;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  $line=82;
                  $result=GCollections.asList(A,GCollections.asList(n,GCollections.asList(a,$opModulY($opAdditY(b,1),5))));
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      $line=85;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8A,B\u27E9:java.lang.Iterable,n:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=88;
      $result="";
      if (true) break $try;
      $line=89;
      $rethrow(new RuntimeException("The function \"g(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"g",$line);
    }
    return $result;
  }
  public static Object h(Object A, Object n) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=92;
      if (($opEqualY(A,'I')&&!$opMembrY(n,alf))) {
        $line=93;
        $result="";
        if (true) break $try;
      }
      else {
        $line=94;
        if ($opEqualY(A,'I')) {
          $line=95;
          $result=n;
          if (true) break $try;
        }
        else {
          $line=96;
          if (($opEqualY(A,"err")||$opMembrY(A,$opIntvlY('0','4')))) {
            $line=97;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=99;
      $rethrow(new RuntimeException("The function \"h(A:Object,n:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"h",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v3, Object n) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object A=$v4.next();
      Object B=$v4.next();
      $line=102;
      if ((($opEqualY(A,"")||$bool((!$opMembrY(A,alf)&&$bool(($opEqualY($getArrayValue(A,new Object[]{0}),"")||$opEqualY($getArrayValue(A,new Object[]{1}),""))))))||$bool(((!$opMembrY(B,alf)&&$opGreatY($opAbsolY(B),1))&&$bool(($opEqualY($getArrayValue(B,new Object[]{0}),"")||$opEqualY($getArrayValue(B,new Object[]{0}),'#'))))))) {
        $line=103;
        $result="";
        if (true) break $try;
      }
      else {
        $line=104;
        if ($opMembrY(A,alf)) {
          $line=105;
          if (($opMembrY(B,alf)&&$opEqualY(n,':'))) {
            $line=106;
            $result=':';
            if (true) break $try;
          }
          else {
            $line=107;
            if ((!$opMembrY(B,alf)&&$opMembrY(n,alf))) {
              $line=108;
              $result=n;
              if (true) break $try;
            }
            else {
              $line=110;
              $result="";
              if (true) break $try;
            }
          }
        }
        else {
          $line=113;
          Object a=$fix($opModulY($opAdditY($getArrayValue(B,new Object[]{1,0}),1),3));
          $line=114;
          Object b=$fix($getArrayValue(B,new Object[]{1,1}));
          $line=115;
          if (($opMembrY(n,$opIntvlY('0','4'))&&$opEqualY($getArrayValue(B,new Object[]{0}),':'))) {
            $line=116;
            $result="";
            if (true) break $try;
          }
          else {
            $line=117;
            if (($opMembrY(n,$opIntvlY('0','4'))&&$bool($opEqualY($opSubtrY(n,'0'),b)))) {
              $line=118;
              $result='$';
              if (true) break $try;
            }
            else {
              $line=119;
              if (($opEqualY(n,':')||$bool(($opEqualY($getArrayValue(B,new Object[]{0}),':')&&$opEqualY(n,'#'))))) {
                $line=120;
                $result="";
                if (true) break $try;
              }
              else {
                $line=121;
                if (!$opMembrY(n,A)) {
                  $line=122;
                  if (($opMembrY(n,alfE)&&$opEqualY(a,1))) {
                    $line=123;
                    $result=Decoder.previousToLower(n);
                    if (true) break $try;
                  }
                  else {
                    $line=124;
                    if (($opMembrY(n,alfE)&&$opEqualY(a,2))) {
                      $line=125;
                      $result=Decoder.toLower(n);
                      if (true) break $try;
                    }
                    else {
                      $line=126;
                      if (($bool(($opMembrY(n,alfE)&&$opEqualY(a,0)))||$opMembrY(n,$opIntvlY('0','4')))) {
                        $line=127;
                        $result="";
                        if (true) break $try;
                      }
                      else {
                        $line=128;
                        if (($opEqualY(n,'#')&&$opMembrY($getArrayValue(B,new Object[]{0}),alfE))) {
                          $line=129;
                          $result="";
                          if (true) break $try;
                        }
                        else {
                          $line=130;
                          if ($opEqualY(n,'#')) {
                            $line=131;
                            $result=$getArrayValue(B,new Object[]{0});
                            if (true) break $try;
                          }
                          else {
                            $line=133;
                            $result=n;
                            if (true) break $try;
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  $line=135;
                  if ($opEqualY(n,$getArrayValue(A,new Object[]{0}))) {
                    $line=136;
                    $result=$getArrayValue(A,new Object[]{1});
                    if (true) break $try;
                  }
                  else {
                    $line=138;
                    $result=$getArrayValue(A,new Object[]{0});
                    if (true) break $try;
                  }
                }
              }
            }
          }
        }
      }
      $line=141;
      $rethrow(new RuntimeException("The function \"h(\u27E8A,B\u27E9:java.lang.Iterable,n:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"h",$line);
    }
    return $result;
  }
  public static Object previousToLower(Object n) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=144;
      Character r=null;
      r=$defaultValue(Character.class);
      $line=145;
      r=$cast(Character.class,$fix($opAdditY($opModulY($opSubtrY($opSubtrY(n,'A'),1),26),'a')));
      $line=146;
      $result=r;
      if (true) break $try;
      $line=147;
      $rethrow(new RuntimeException("The function \"previousToLower(n:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"previousToLower",$line);
    }
    return $result;
  }
  public static Object toLower(Object n) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=150;
      Character r=null;
      r=$defaultValue(Character.class);
      $line=151;
      r=$cast(Character.class,$fix($opAdditY($opSubtrY(n,'A'),'a')));
      $line=152;
      $result=r;
      if (true) break $try;
      $line=153;
      $rethrow(new RuntimeException("The function \"toLower(n:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"toLower",$line);
    }
    return $result;
  }
}
